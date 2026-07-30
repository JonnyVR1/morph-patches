package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.android.p048ui.label.LabelModule;
import com.p046p1.mobile.android.p048ui.label.LabelStyle;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.newui.label.CommonLabelTag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a8i;
import p149l.b8i;
import p149l.c8i;
import p149l.d8i;
import p149l.e8i;
import p149l.f3c0;
import p149l.f8i;
import p149l.g8i;
import p149l.ijb0;
import p149l.k8i;
import p149l.l8i;
import p149l.q6r;
import p149l.s6r;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedUserSexAndAgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f43429a;

    /* JADX INFO: renamed from: b */
    public VImage f43430b;

    /* JADX INFO: renamed from: c */
    public VText f43431c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f43432d;

    /* JADX INFO: renamed from: e */
    public int f43433e;

    public FeedUserSexAndAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m66372a(View view) {
        l8i.m148921a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m66373b(int i, User user) {
        k8i d8iVar;
        TextPaint paint = this.f43431c.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(true);
        }
        if (i == 0) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94670y5 : f3c0.f94294B5;
            d8iVar = new g8i();
        } else if (i == 5) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94670y5 : f3c0.f94294B5;
            d8iVar = new b8i();
        } else if (i == 1) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94678z5 : f3c0.f94302C5;
            d8iVar = new a8i();
        } else if (i == 2) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94670y5 : f3c0.f94294B5;
            d8iVar = new f8i();
        } else if (i == 3) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94662x5 : f3c0.f94286A5;
            d8iVar = new c8i();
        } else if (i == 6) {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94662x5 : f3c0.f94286A5;
            d8iVar = new e8i();
        } else {
            this.f43433e = (NullChecker.m81303a(user) && user.isFemale()) ? f3c0.f94662x5 : f3c0.f94286A5;
            d8iVar = new d8i();
        }
        d8iVar.mo95347a(this, user);
    }

    /* JADX INFO: renamed from: c */
    public final void m66374c(User user, int i) {
        LabelStyle labelStyle;
        LabelStyle labelStyle2 = LabelStyle.SMALL;
        if (i == 0 || i == 5) {
            labelStyle = LabelStyle.MIDDLE;
        } else if (i == 1) {
            labelStyle = LabelStyle.MAX;
        } else if (i == 2) {
            labelStyle = LabelStyle.MIDDLE;
        } else {
            labelStyle = (i != 3 && i == 6) ? LabelStyle.SMALL : LabelStyle.SMALL;
        }
        this.f43432d.setSizeStyle(labelStyle);
        q6r q6rVarM182456c = s6r.m182454a().m182456c(LabelModule.COMMON, user.isFemale() ? CommonLabelTag.SEX_AGE_FEMALE : CommonLabelTag.SEX_AGE_MALE);
        q6rVarM182456c.m173154g(ijb0.m136582v(user) ? "" : String.valueOf(user.age));
        this.f43432d.m21084g(q6rVarM182456c);
    }

    /* JADX INFO: renamed from: d */
    public void m66375d(User user, int i, int i2) {
        if (FeedModule.m60222H().mo30692I4()) {
            m66374c(user, i2);
            return;
        }
        m66373b(i2, user);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (FeedModule.m60222H().mo30694Ic() && (i2 == 5 || i2 == 1)) {
            gradientDrawable.setColor(Color.parseColor("#33FFFFFF"));
        } else {
            gradientDrawable.setColor(Color.parseColor((NullChecker.m81303a(user) && user.isFemale()) ? "#FF89E5" : "#FF2BCCFF"));
        }
        gradientDrawable.setCornerRadius(t100.m186890d(i));
        this.f43429a.setBackground(gradientDrawable);
        this.f43430b.setImageResource(this.f43433e);
        boolean zM136582v = ijb0.m136582v(user);
        VText vText = this.f43431c;
        if (zM136582v) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f43431c.setText(String.valueOf(user.age));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66372a(this);
        if (FeedModule.m60222H().mo30692I4()) {
            xdl0.m208344M(this.f43429a, false);
            xdl0.m208344M(this.f43432d, true);
        }
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
