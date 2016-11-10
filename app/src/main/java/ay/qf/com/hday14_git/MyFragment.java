package ay.qf.com.hday14_git;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samsung on 2016/11/10.
 */
public class MyFragment extends Fragment{
    private static final String TAG = "tmd";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: 我是小羊添加的Fragment");

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
