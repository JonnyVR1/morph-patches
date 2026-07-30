package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.android.p053ui.label.LabelModule;
import com.p051p1.mobile.android.p053ui.label.LabelStyle;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.newui.label.CommonLabelTag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.aai;
import p153l.bnl0;
import p153l.lbc0;
import p153l.mrb0;
import p153l.p9i;
import p153l.q9i;
import p153l.qa00;
import p153l.r8r;
import p153l.r9i;
import p153l.s9i;
import p153l.t8r;
import p153l.t9i;
import p153l.u9i;
import p153l.v9i;
import p153l.z9i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedUserSexAndAgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f44277a;

    /* JADX INFO: renamed from: b */
    public VImage f44278b;

    /* JADX INFO: renamed from: c */
    public VText f44279c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f44280d;

    /* JADX INFO: renamed from: e */
    public int f44281e;

    public FeedUserSexAndAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m67555a(View view) {
        aai.m96644a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m67556b(int i, User user) {
        z9i s9iVar;
        TextPaint paint = this.f44279c.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(true);
        }
        if (i == 0) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131188y5 : lbc0.f130812B5;
            s9iVar = new v9i();
        } else if (i == 5) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131188y5 : lbc0.f130812B5;
            s9iVar = new q9i();
        } else if (i == 1) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131196z5 : lbc0.f130820C5;
            s9iVar = new p9i();
        } else if (i == 2) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131188y5 : lbc0.f130812B5;
            s9iVar = new u9i();
        } else if (i == 3) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131180x5 : lbc0.f130804A5;
            s9iVar = new r9i();
        } else if (i == 6) {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131180x5 : lbc0.f130804A5;
            s9iVar = new t9i();
        } else {
            this.f44281e = (NullChecker.m82486a(user) && user.isFemale()) ? lbc0.f131180x5 : lbc0.f130804A5;
            s9iVar = new s9i();
        }
        s9iVar.mo171362a(this, user);
    }

    /* JADX INFO: renamed from: c */
    public final void m67557c(User user, int i) {
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
        this.f44280d.setSizeStyle(labelStyle);
        r8r r8rVarM189688c = t8r.m189686a().m189688c(LabelModule.COMMON, user.isFemale() ? CommonLabelTag.SEX_AGE_FEMALE : CommonLabelTag.SEX_AGE_MALE);
        r8rVarM189688c.m180243g(mrb0.m159668v(user) ? "" : String.valueOf(user.age));
        this.f44280d.m22083g(r8rVarM189688c);
    }

    /* JADX INFO: renamed from: d */
    public void m67558d(User user, int i, int i2) {
        if (FeedModule.m61406H().mo31695I4()) {
            m67557c(user, i2);
            return;
        }
        m67556b(i2, user);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (FeedModule.m61406H().mo31697Ic() && (i2 == 5 || i2 == 1)) {
            gradientDrawable.setColor(Color.parseColor("#33FFFFFF"));
        } else {
            gradientDrawable.setColor(Color.parseColor((NullChecker.m82486a(user) && user.isFemale()) ? "#FF89E5" : "#FF2BCCFF"));
        }
        gradientDrawable.setCornerRadius(qa00.m175859d(i));
        this.f44277a.setBackground(gradientDrawable);
        this.f44278b.setImageResource(this.f44281e);
        boolean zM159668v = mrb0.m159668v(user);
        VText vText = this.f44279c;
        if (zM159668v) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f44279c.setText(String.valueOf(user.age));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67555a(this);
        if (FeedModule.m61406H().mo31695I4()) {
            bnl0.m105524M(this.f44277a, false);
            bnl0.m105524M(this.f44280d, true);
        }
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
