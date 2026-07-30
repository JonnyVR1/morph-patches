package com.p051p1.mobile.putong.core.p058ui.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.r3m;
import p153l.uqb0;
import p153l.vf40;

/* JADX INFO: loaded from: classes4.dex */
public class NewProfileFakeView extends RelativeLayout implements r3m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f33671a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f33672b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33673c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f33674d;

    /* JADX INFO: renamed from: e */
    public ImageView f33675e;

    /* JADX INFO: renamed from: f */
    public FakeTwoCardView f33676f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f33677g;

    /* JADX INFO: renamed from: h */
    public VText f33678h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f33679i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f33680j;

    /* JADX INFO: renamed from: k */
    public VImage f33681k;

    /* JADX INFO: renamed from: l */
    public Runnable f33682l;

    /* JADX INFO: renamed from: m */
    public Runnable f33683m;

    /* JADX INFO: renamed from: n */
    public Runnable f33684n;

    public NewProfileFakeView(Context context) {
        super(context);
    }

    @Override // p153l.r3m
    /* JADX INFO: renamed from: a */
    public void mo51611a(boolean z, Media media) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9.fakeStatus)) {
            m51617j(z, media, true, userM116600p9.fakeStatus.text);
        } else {
            m51617j(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m51612e(View view) {
        vf40.m201116a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m51613f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m51614g(View view) {
        if (NullChecker.m82486a(this.f33682l)) {
            this.f33682l.run();
        }
    }

    @Override // p153l.r3m
    public View getRenderView() {
        return this;
    }

    @Override // p153l.r3m
    public TextView getTitleView() {
        return this.f33677g;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m51615h(View view) {
        if (NullChecker.m82486a(this.f33683m)) {
            this.f33683m.run();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m51616i(View view) {
        if (NullChecker.m82486a(this.f33684n)) {
            this.f33684n.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m51617j(boolean z, Media media, boolean z2, String str) {
        uqb0.f180374G.m127115L0(this.f33674d, media.url);
        if (!z) {
            bnl0.m105524M(this.f33679i, true);
            this.f33679i.setText("我知道了");
            bnl0.m105524M(this.f33680j, false);
            this.f33677g.setText(m51613f().string(R$string.f18369Cl));
            this.f33678h.setText(R$string.f18338Bl);
            this.f33675e.setImageResource(dbc0.f86224Hn);
            return;
        }
        CoreModule.f18264c.f20381e0.m116600p9();
        this.f33678h.setText("当前右滑次数受限，无法获得配对，开启隐私模式，让缘分找到你。");
        this.f33677g.setText("头像不真实");
        this.f33678h.setGravity(17);
        this.f33677g.setText("头像不真实");
        this.f33675e.setImageResource(dbc0.f87521vn);
        bnl0.m105524M(this.f33679i, true);
        bnl0.m105524M(this.f33680j, true);
        this.f33679i.setText("隐私模式");
        this.f33680j.setText("上传头像");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51612e(this);
        bnl0.m105509E0(this.f33681k, new View.OnClickListener() { // from class: l.sf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167669a.m51614g(view);
            }
        });
        bnl0.m105509E0(this.f33679i, new View.OnClickListener() { // from class: l.tf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173927a.m51615h(view);
            }
        });
        bnl0.m105509E0(this.f33680j, new View.OnClickListener() { // from class: l.uf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178734a.m51616i(view);
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
