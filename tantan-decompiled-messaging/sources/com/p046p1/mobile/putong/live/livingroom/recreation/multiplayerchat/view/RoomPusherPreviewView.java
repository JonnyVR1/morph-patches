package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.vcd0;

/* JADX INFO: loaded from: classes5.dex */
public class RoomPusherPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51516a;

    /* JADX INFO: renamed from: b */
    public ImageView f51517b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f51518c;

    /* JADX INFO: renamed from: d */
    public TextView f51519d;

    public RoomPusherPreviewView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75983a(View view) {
        vcd0.m197748a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75983a(this);
    }

    public RoomPusherPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomPusherPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
