package com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry;

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
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import java.util.List;
import p153l.ldc0;
import p153l.qa00;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceEntryAvatarLayout extends ConstraintLayout {
    private MultipleChatIconView multipleChatIconView;
    private FrameLayout tagGroup;
    private TextView tagView;

    public VoiceEntryAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        LayoutInflater.from(context).inflate(xec0.f193828V1, this);
        this.multipleChatIconView = (MultipleChatIconView) findViewById(ldc0.f131613w);
        this.tagGroup = (FrameLayout) findViewById(ldc0.f131488N1);
        this.tagView = (TextView) findViewById(ldc0.f131484M1);
    }

    /* JADX INFO: renamed from: h0 */
    public void m71035h0(List<String> list, float f) {
        MultipleChatIconView multipleChatIconView = this.multipleChatIconView;
        if (multipleChatIconView != null) {
            multipleChatIconView.setRadius(f);
            this.multipleChatIconView.m80580p0(list, false);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m71036i0(String str) {
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
        int i = qa00.f156318e;
        path.addRoundRect(rectF, i, i, Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }
}
