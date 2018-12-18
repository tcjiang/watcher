package ca.tjweb.watcher.feature;

import android.support.v4.app.ActivityCompat;

import android.support.v4.app.Fragment;
import android.view.View;


public class CameraFragment extends Fragment
        implements View.OnClickListener, ActivityCompat.OnRequestPermissionsResultCallback {

    public static CameraFragment newInstance() {
        return new CameraFragment();
    }

    @Override
    public void onClick(View view) {
    }
}
