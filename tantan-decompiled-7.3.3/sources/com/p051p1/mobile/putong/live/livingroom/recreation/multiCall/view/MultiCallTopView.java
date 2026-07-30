package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.ar10;
import p153l.bf10;
import p153l.bnl0;
import p153l.hr10;
import p153l.iam;
import p153l.ir10;
import p153l.jr10;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.tm10;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallTopView extends FrameLayout implements iam<ar10<?>> {

    /* JADX INFO: renamed from: a */
    public ViewGroup f52261a;

    /* JADX INFO: renamed from: b */
    public float f52262b;

    /* JADX INFO: renamed from: c */
    public float f52263c;

    /* JADX INFO: renamed from: d */
    public ar10<?> f52264d;

    /* JADX INFO: renamed from: e */
    public ArrayList<MultiCallCellTopView> f52265e;

    /* JADX INFO: renamed from: f */
    public String f52266f;

    /* JADX INFO: renamed from: g */
    public MultiCallCellTopView f52267g;

    /* JADX INFO: renamed from: h */
    public boolean f52268h;

    /* JADX INFO: renamed from: i */
    public boolean f52269i;

    /* JADX INFO: renamed from: j */
    public VText f52270j;

    public MultiCallTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52268h = true;
        this.f52269i = false;
    }

    /* JADX INFO: renamed from: A */
    public void m77020A() {
        if (this.f52270j == null) {
            VText vText = new VText(getContext());
            this.f52270j = vText;
            vText.setId(View.generateViewId());
            this.f52270j.setTextColor(-1);
            this.f52270j.setTextSize(15.0f);
            this.f52270j.setText(R$string.f48116h0);
        }
        if (findViewById(this.f52270j.getId()) != null) {
            bnl0.m105524M(this.f52270j, true);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = qa00.m175859d(174.0f);
        addView(this.f52270j, layoutParams);
    }

    /* JADX INFO: renamed from: B */
    public final void m77021B(tm10 tm10Var, ArrayList<MultiCallCellTopView> arrayList) {
        removeAllViews();
        int i = 0;
        while (i < arrayList.size()) {
            MultiCallCellTopView multiCallCellTopView = arrayList.get(i);
            int i2 = i + 1;
            FrameLayout.LayoutParams layoutParamsM191716b = tm10Var.m191716b(i2, 0, 0);
            if (layoutParamsM191716b != null) {
                if (!multiCallCellTopView.m77004p0()) {
                    addView(arrayList.get(i), layoutParamsM191716b);
                }
                multiCallCellTopView.setLayoutParams(layoutParamsM191716b);
            }
            i = i2;
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        setViewVisible(false);
        this.f52267g = null;
        this.f52268h = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m77022i(View view) {
        hr10.m136735a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ar10<?> ar10Var) {
        this.f52264d = ar10Var;
    }

    /* JADX INFO: renamed from: k */
    public void m77024k() {
        if (NullChecker.m82486a(this.f52267g)) {
            this.f52267g.m77003o0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m77025l() {
        VText vText = this.f52270j;
        if (vText != null) {
            bnl0.m105524M(vText, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m77026m(int i, View view) {
        this.f52264d.m99615f4(i + 1);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77027n(int i, View view) {
        this.f52264d.m99614e4(i + 1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77022i(this);
        this.f52265e = new ArrayList<>();
        final int i = 0;
        while (i < 9) {
            MultiCallCellTopView multiCallCellTopView = (MultiCallCellTopView) View.inflate(getContext(), yec0.f199086g4, null);
            int i2 = i + 1;
            multiCallCellTopView.setViewPosition(i2);
            bnl0.m105509E0(multiCallCellTopView, new View.OnClickListener() { // from class: l.br10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77970a.m77026m(i, view);
                }
            });
            bnl0.m105509E0(multiCallCellTopView.f52239g, new View.OnClickListener() { // from class: l.cr10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f83268a.m77027n(i, view);
                }
            });
            this.f52265e.add(multiCallCellTopView);
            i = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f52263c = motionEvent.getX();
            this.f52262b = motionEvent.getY();
        } else if (action == 2) {
            if ((Math.abs(motionEvent.getX() - this.f52263c) <= 10.0f && Math.abs(motionEvent.getY() - this.f52262b) <= 10.0f) || !NullChecker.m82486a(this.f52261a)) {
                return false;
            }
            this.f52261a.requestDisallowInterceptTouchEvent(false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m77028p(User user, View view) {
        this.f52264d.m99618i4(user);
    }

    /* JADX INFO: renamed from: q */
    public void m77029q(int i, int i2, boolean z, Float f) {
        if (!bf10.m103819Y(i, i2) || this.f52265e.size() < i) {
            return;
        }
        MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i - 1);
        if (multiCallCellTopView.m77004p0()) {
            multiCallCellTopView.m77008t0(z, f);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m77030s(List<BLiveMultiCall> list, String str) {
        this.f52268h = true;
        if (!TextUtils.equals(this.f52266f, str)) {
            this.f52266f = str;
            m77021B(new tm10(str), this.f52265e);
        }
        for (final int i = 0; i < this.f52265e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i);
            BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) jyb.m147529r(list, new qcj() { // from class: l.fr10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveMultiCall) obj).position - 1 == i);
                }
            });
            if (multiCallCellTopView.m77004p0()) {
                m77035y(multiCallCellTopView, bLiveMultiCall, i + 1, str);
            }
        }
    }

    public void setSwallowTarget(ViewGroup viewGroup) {
        this.f52261a = viewGroup;
        viewGroup.requestDisallowInterceptTouchEvent(true);
    }

    public void setViewVisible(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public void m77031u(final User user, int i, int i2) {
        if (!bf10.m103819Y(i, i2) || this.f52265e.size() < i) {
            return;
        }
        boolean z = true;
        MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i - 1);
        if (multiCallCellTopView.m77004p0()) {
            if (!user.matchedOrFollowed() && !bf10.m103817W(user.f56859id)) {
                z = false;
            }
            multiCallCellTopView.setFollowView(z);
            if (user.matchedOrFollowed()) {
                return;
            }
            bnl0.m105509E0(multiCallCellTopView.f52250r, new View.OnClickListener() { // from class: l.gr10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105993a.m77028p(user, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public void m77032v() {
        for (int i = 0; i < this.f52265e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i);
            if (multiCallCellTopView.m77004p0()) {
                multiCallCellTopView.m76991B0();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m77033w(List<LongLinkLiveMultiPk.MultiPkPlayer> list) {
        for (final int i = 0; i < this.f52265e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i);
            LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) jyb.m147529r(list, new qcj() { // from class: l.er10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getPosition() - 1 == ((long) i));
                }
            });
            if (multiCallCellTopView.m77004p0()) {
                multiCallCellTopView.m76997J0(multiPkPlayer);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m77034x(LongLinkLiveMultiPk.MultiPk multiPk) {
        List<LongLinkLiveMultiPk.MultiPkPlayer> playersList = multiPk.getPlayersList();
        for (final int i = 0; i < this.f52265e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f52265e.get(i);
            LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) jyb.m147529r(playersList, new qcj() { // from class: l.dr10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getPosition() - 1 == ((long) i));
                }
            });
            if (multiCallCellTopView.m77004p0()) {
                multiCallCellTopView.m77013z0(multiPkPlayer, multiPk);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m77035y(MultiCallCellTopView multiCallCellTopView, BLiveMultiCall bLiveMultiCall, int i, String str) {
        multiCallCellTopView.m77009u0(bLiveMultiCall, this.f52264d, str);
        m77036z(bLiveMultiCall, multiCallCellTopView, str);
        if (NullChecker.m82486a(bLiveMultiCall)) {
            ir10.m141746a("renderSinGleCall:callId=" + bLiveMultiCall.f45248id + ",position=" + i + ",state=" + bLiveMultiCall.state);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m77036z(BLiveMultiCall bLiveMultiCall, MultiCallCellTopView multiCallCellTopView, String str) {
        if (bLiveMultiCall == null && this.f52268h) {
            this.f52268h = false;
            if (!this.f52264d.m99617h4()) {
                this.f52269i = false;
                m77024k();
                return;
            }
            this.f52267g = multiCallCellTopView;
            if (this.f52264d.m99619j4()) {
                this.f52267g.m77011w0(this.f52264d, true, str);
                this.f52264d.m99610H4(this.f52267g);
            } else {
                if (!this.f52269i) {
                    this.f52269i = true;
                    jr10.m146664n(this.f52264d.m99620k4());
                }
                this.f52267g.m77011w0(this.f52264d, false, str);
            }
        }
    }

    public MultiCallTopView(Context context) {
        super(context);
        this.f52268h = true;
        this.f52269i = false;
    }

    public MultiCallTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52268h = true;
        this.f52269i = false;
    }
}
