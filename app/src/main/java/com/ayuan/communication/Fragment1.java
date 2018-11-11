package com.ayuan.communication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.activity_fragment1, null);
        //找到按钮设置点击事件
        Button replace = (Button) inflate.findViewById(R.id.btn_replace);
        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //修改Fragment2里面的TextView里面的值
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                Fragment2 f2 = (Fragment2) fragmentManager.findFragmentByTag("f2");
                f2.setText("hahaha");
                /*View view = f2.getView();
                TextView viewById = (TextView) view.findViewById(R.id.tv_text);
                viewById.setText("你好世家");*/
            }
        });
        return inflate;
    }
}
