package com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import java.util.List;
import p149l.f5c0;
import p149l.s6c0;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceEntryAvatarLayout extends ConstraintLayout {
    private MultipleChatIconView multipleChatIconView;
    private FrameLayout tagGroup;
    private TextView tagView;

    public VoiceEntryAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        LayoutInflater.from(context).inflate(s6c0.f162714V1, this);
        this.multipleChatIconView = (MultipleChatIconView) findViewById(f5c0.f95156w);
        this.tagGroup = (FrameLayout) findViewById(f5c0.f95031N1);
        this.tagView = (TextView) findViewById(f5c0.f95027M1);
    }

    /* JADX INFO: renamed from: h0 */
    public void m69852h0(List<String> list, float f) {
        MultipleChatIconView multipleChatIconView = this.multipleChatIconView;
        if (multipleChatIconView != null) {
            multipleChatIconView.setRadius(f);
            this.multipleChatIconView.m79397p0(list, false);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m69853i0(String str) {
        if (this.tagGroup == null || this.tagView == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        FrameLayout frameLayout = this.tagGroup;
        if (zIsEmpty) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            this.tagView.setText(str);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        FrameLayout frameLayout = this.tagGroup;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        Path path = new Path();
        RectF rectF = new RectF(this.tagGroup.getX(), this.tagGroup.getY(), this.tagGroup.getX() + this.tagGroup.getWidth(), this.tagGroup.getY() + this.tagGroup.getHeight());
        int i = t100.f167256e;
        path.addRoundRect(rectF, i, i, Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }
}
