package com.p000p1.mobile.putong.core.p001ui.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.h740;
import l.qib0;
import l.x2c0;
import l.xdl0;
import p002l.y0m;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NewProfileFakeView extends RelativeLayout implements y0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f645a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f646b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f647c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f648d;

    /* JADX INFO: renamed from: e */
    public ImageView f649e;

    /* JADX INFO: renamed from: f */
    public FakeTwoCardView f650f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f651g;

    /* JADX INFO: renamed from: h */
    public VText f652h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f653i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f654j;

    /* JADX INFO: renamed from: k */
    public VImage f655k;

    /* JADX INFO: renamed from: l */
    public Runnable f656l;

    /* JADX INFO: renamed from: m */
    public Runnable f657m;

    /* JADX INFO: renamed from: n */
    public Runnable f658n;

    public NewProfileFakeView(Context context) {
        super(context);
    }

    @Override // p002l.y0m
    /* JADX INFO: renamed from: a */
    public void mo863a(boolean z, Media media) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9.fakeStatus)) {
            m869j(z, media, true, userP9.fakeStatus.text);
        } else {
            m869j(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m864e(View view) {
        h740.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m865f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m866g(View view) {
        if (NullChecker.a(this.f656l)) {
            this.f656l.run();
        }
    }

    @Override // p002l.y0m
    public View getRenderView() {
        return this;
    }

    @Override // p002l.y0m
    public TextView getTitleView() {
        return this.f651g;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m867h(View view) {
        if (NullChecker.a(this.f657m)) {
            this.f657m.run();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m868i(View view) {
        if (NullChecker.a(this.f658n)) {
            this.f658n.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m869j(boolean z, Media media, boolean z2, String str) {
        qib0.G.L0(this.f648d, media.url);
        if (!z) {
            xdl0.M(this.f653i, true);
            this.f653i.setText("我知道了");
            xdl0.M(this.f654j, false);
            this.f651g.setText(m865f().string(R.string.gl));
            this.f652h.setText(R.string.fl);
            this.f649e.setImageResource(x2c0.Tm);
            return;
        }
        CoreModule.c.e0.p9();
        this.f652h.setText("当前右滑次数受限，无法获得配对，开启隐私模式，让缘分找到你。");
        this.f651g.setText("头像不真实");
        this.f652h.setGravity(17);
        this.f651g.setText("头像不真实");
        this.f649e.setImageResource(x2c0.Hm);
        xdl0.M(this.f653i, true);
        xdl0.M(this.f654j, true);
        this.f653i.setText("隐私模式");
        this.f654j.setText("上传头像");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m864e(this);
        xdl0.E0(this.f655k, new View.OnClickListener() { // from class: l.e740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9601a.m866g(view);
            }
        });
        xdl0.E0(this.f653i, new View.OnClickListener() { // from class: l.f740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10158a.m867h(view);
            }
        });
        xdl0.E0(this.f654j, new View.OnClickListener() { // from class: l.g740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11290a.m868i(view);
            }
        });
    }

    public NewProfileFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewProfileFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
