package paul.wintz.parametricequationdrawer.controllers.javafx;

import javafx.fxml.FXML;
import paul.wintz.javafx.widgets.IntegerSpinner;
import paul.wintz.spirotechnics.cirlcesspirotechnic.parameters.SpirotechnicControlsPresenter;
import paul.wintz.uioptiontypes.values.IntegerOption;
import paul.wintz.utils.logging.Lg;

public class CircleControlsView implements SpirotechnicControlsPresenter.CircleControlsPresenter.View {
    private static final String TAG = Lg.makeTAG(CircleControlsView.class);

    @FXML IntegerSpinner radius;
    @FXML IntegerSpinner velocity;

    @Override
    public void setRadiusOption(IntegerOption radiusOption) {
        Lg.v(TAG, "setRadiusOption(%s)", radiusOption);
        radius.setOption(radiusOption);
    }

    @Override
    public void setVelocityOption(IntegerOption velocityOption) {
        Lg.v(TAG, "setVelocityOption(%s)", velocityOption);
        velocity.setOption(velocityOption);
    }
}
