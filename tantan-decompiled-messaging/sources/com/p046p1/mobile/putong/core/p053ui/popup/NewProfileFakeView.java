package com.p046p1.mobile.putong.core.p053ui.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.h740;
import p149l.qib0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.y0m;

/* JADX INFO: loaded from: classes4.dex */
public class NewProfileFakeView extends RelativeLayout implements y0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f32823a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32824b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32825c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32826d;

    /* JADX INFO: renamed from: e */
    public ImageView f32827e;

    /* JADX INFO: renamed from: f */
    public FakeTwoCardView f32828f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f32829g;

    /* JADX INFO: renamed from: h */
    public VText f32830h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f32831i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f32832j;

    /* JADX INFO: renamed from: k */
    public VImage f32833k;

    /* JADX INFO: renamed from: l */
    public Runnable f32834l;

    /* JADX INFO: renamed from: m */
    public Runnable f32835m;

    /* JADX INFO: renamed from: n */
    public Runnable f32836n;

    public NewProfileFakeView(Context context) {
        super(context);
    }

    @Override // p149l.y0m
    /* JADX INFO: renamed from: a */
    public void mo50428a(boolean z, Media media) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9.fakeStatus)) {
            m50434j(z, media, true, userM169527p9.fakeStatus.text);
        } else {
            m50434j(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m50429e(View view) {
        h740.m129619a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m50430f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m50431g(View view) {
        if (NullChecker.m81303a(this.f32834l)) {
            this.f32834l.run();
        }
    }

    @Override // p149l.y0m
    public View getRenderView() {
        return this;
    }

    @Override // p149l.y0m
    public TextView getTitleView() {
        return this.f32829g;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m50432h(View view) {
        if (NullChecker.m81303a(this.f32835m)) {
            this.f32835m.run();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m50433i(View view) {
        if (NullChecker.m81303a(this.f32836n)) {
            this.f32836n.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50434j(boolean z, Media media, boolean z2, String str) {
        qib0.f154691G.m102331L0(this.f32826d, media.url);
        if (!z) {
            xdl0.m208344M(this.f32831i, true);
            this.f32831i.setText("我知道了");
            xdl0.m208344M(this.f32832j, false);
            this.f32829g.setText(m50430f().string(R$string.f18553gl));
            this.f32830h.setText(R$string.f18522fl);
            this.f32827e.setImageResource(x2c0.f189771Tm);
            return;
        }
        CoreModule.f17545c.f19639e0.m169527p9();
        this.f32830h.setText("当前右滑次数受限，无法获得配对，开启隐私模式，让缘分找到你。");
        this.f32829g.setText("头像不真实");
        this.f32830h.setGravity(17);
        this.f32829g.setText("头像不真实");
        this.f32827e.setImageResource(x2c0.f189399Hm);
        xdl0.m208344M(this.f32831i, true);
        xdl0.m208344M(this.f32832j, true);
        this.f32831i.setText("隐私模式");
        this.f32832j.setText("上传头像");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50429e(this);
        xdl0.m208329E0(this.f32833k, new View.OnClickListener() { // from class: l.e740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89668a.m50431g(view);
            }
        });
        xdl0.m208329E0(this.f32831i, new View.OnClickListener() { // from class: l.f740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96195a.m50432h(view);
            }
        });
        xdl0.m208329E0(this.f32832j, new View.OnClickListener() { // from class: l.g740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101331a.m50433i(view);
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
