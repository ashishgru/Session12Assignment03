package ashishrpa.session12assignment03;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WINDOWS 8.1 on 11/11/2016.
 */

public class Fragment02 extends Fragment {
    View rootView;
    MainActivity activity = (MainActivity) getActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        rootView = inflater.inflate(R.layout.my_fragment02, container, false);

        return rootView;
    }
}
