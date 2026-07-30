package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.je10;
import p149l.qi10;
import p149l.r610;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xi10;
import p149l.yi10;
import p149l.zi10;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallTopView extends FrameLayout implements s7m<qi10<?>> {

    /* JADX INFO: renamed from: a */
    public ViewGroup f51413a;

    /* JADX INFO: renamed from: b */
    public float f51414b;

    /* JADX INFO: renamed from: c */
    public float f51415c;

    /* JADX INFO: renamed from: d */
    public qi10<?> f51416d;

    /* JADX INFO: renamed from: e */
    public ArrayList<MultiCallCellTopView> f51417e;

    /* JADX INFO: renamed from: f */
    public String f51418f;

    /* JADX INFO: renamed from: g */
    public MultiCallCellTopView f51419g;

    /* JADX INFO: renamed from: h */
    public boolean f51420h;

    /* JADX INFO: renamed from: i */
    public boolean f51421i;

    /* JADX INFO: renamed from: j */
    public VText f51422j;

    public MultiCallTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51420h = true;
        this.f51421i = false;
    }

    /* JADX INFO: renamed from: A */
    public void m75837A() {
        if (this.f51422j == null) {
            VText vText = new VText(getContext());
            this.f51422j = vText;
            vText.setId(View.generateViewId());
            this.f51422j.setTextColor(-1);
            this.f51422j.setTextSize(15.0f);
            this.f51422j.setText(R$string.f47268h0);
        }
        if (findViewById(this.f51422j.getId()) != null) {
            xdl0.m208344M(this.f51422j, true);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = t100.m186890d(174.0f);
        addView(this.f51422j, layoutParams);
    }

    /* JADX INFO: renamed from: B */
    public final void m75838B(je10 je10Var, ArrayList<MultiCallCellTopView> arrayList) {
        removeAllViews();
        int i = 0;
        while (i < arrayList.size()) {
            MultiCallCellTopView multiCallCellTopView = arrayList.get(i);
            int i2 = i + 1;
            FrameLayout.LayoutParams layoutParamsM141093b = je10Var.m141093b(i2, 0, 0);
            if (layoutParamsM141093b != null) {
                if (!multiCallCellTopView.m75821p0()) {
                    addView(arrayList.get(i), layoutParamsM141093b);
                }
                multiCallCellTopView.setLayoutParams(layoutParamsM141093b);
            }
            i = i2;
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        setViewVisible(false);
        this.f51419g = null;
        this.f51420h = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m75839i(View view) {
        xi10.m208912a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qi10<?> qi10Var) {
        this.f51416d = qi10Var;
    }

    /* JADX INFO: renamed from: k */
    public void m75841k() {
        if (NullChecker.m81303a(this.f51419g)) {
            this.f51419g.m75820o0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m75842l() {
        VText vText = this.f51422j;
        if (vText != null) {
            xdl0.m208344M(vText, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75843m(int i, View view) {
        this.f51416d.m174742f4(i + 1);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75844n(int i, View view) {
        this.f51416d.m174741e4(i + 1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75839i(this);
        this.f51417e = new ArrayList<>();
        final int i = 0;
        while (i < 9) {
            MultiCallCellTopView multiCallCellTopView = (MultiCallCellTopView) View.inflate(getContext(), t6c0.f168354g4, null);
            int i2 = i + 1;
            multiCallCellTopView.setViewPosition(i2);
            xdl0.m208329E0(multiCallCellTopView, new View.OnClickListener() { // from class: l.ri10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159510a.m75843m(i, view);
                }
            });
            xdl0.m208329E0(multiCallCellTopView.f51391g, new View.OnClickListener() { // from class: l.si10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f164665a.m75844n(i, view);
                }
            });
            this.f51417e.add(multiCallCellTopView);
            i = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f51415c = motionEvent.getX();
            this.f51414b = motionEvent.getY();
        } else if (action == 2) {
            if ((Math.abs(motionEvent.getX() - this.f51415c) <= 10.0f && Math.abs(motionEvent.getY() - this.f51414b) <= 10.0f) || !NullChecker.m81303a(this.f51413a)) {
                return false;
            }
            this.f51413a.requestDisallowInterceptTouchEvent(false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75845p(User user, View view) {
        this.f51416d.m174745i4(user);
    }

    /* JADX INFO: renamed from: q */
    public void m75846q(int i, int i2, boolean z, Float f) {
        if (!r610.m177990Y(i, i2) || this.f51417e.size() < i) {
            return;
        }
        MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i - 1);
        if (multiCallCellTopView.m75821p0()) {
            multiCallCellTopView.m75825t0(z, f);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m75847s(List<BLiveMultiCall> list, String str) {
        this.f51420h = true;
        if (!TextUtils.equals(this.f51418f, str)) {
            this.f51418f = str;
            m75838B(new je10(str), this.f51417e);
        }
        for (final int i = 0; i < this.f51417e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i);
            BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) vwb.m200346r(list, new w9j() { // from class: l.vi10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveMultiCall) obj).position - 1 == i);
                }
            });
            if (multiCallCellTopView.m75821p0()) {
                m75852y(multiCallCellTopView, bLiveMultiCall, i + 1, str);
            }
        }
    }

    public void setSwallowTarget(ViewGroup viewGroup) {
        this.f51413a = viewGroup;
        viewGroup.requestDisallowInterceptTouchEvent(true);
    }

    public void setViewVisible(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public void m75848u(final User user, int i, int i2) {
        if (!r610.m177990Y(i, i2) || this.f51417e.size() < i) {
            return;
        }
        boolean z = true;
        MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i - 1);
        if (multiCallCellTopView.m75821p0()) {
            if (!user.matchedOrFollowed() && !r610.m177988W(user.f56011id)) {
                z = false;
            }
            multiCallCellTopView.setFollowView(z);
            if (user.matchedOrFollowed()) {
                return;
            }
            xdl0.m208329E0(multiCallCellTopView.f51402r, new View.OnClickListener() { // from class: l.wi10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186495a.m75845p(user, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public void m75849v() {
        for (int i = 0; i < this.f51417e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i);
            if (multiCallCellTopView.m75821p0()) {
                multiCallCellTopView.m75808B0();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m75850w(List<LongLinkLiveMultiPk.MultiPkPlayer> list) {
        for (final int i = 0; i < this.f51417e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i);
            LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) vwb.m200346r(list, new w9j() { // from class: l.ui10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getPosition() - 1 == ((long) i));
                }
            });
            if (multiCallCellTopView.m75821p0()) {
                multiCallCellTopView.m75814J0(multiPkPlayer);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m75851x(LongLinkLiveMultiPk.MultiPk multiPk) {
        List<LongLinkLiveMultiPk.MultiPkPlayer> playersList = multiPk.getPlayersList();
        for (final int i = 0; i < this.f51417e.size(); i++) {
            MultiCallCellTopView multiCallCellTopView = this.f51417e.get(i);
            LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer = (LongLinkLiveMultiPk.MultiPkPlayer) vwb.m200346r(playersList, new w9j() { // from class: l.ti10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LongLinkLiveMultiPk.MultiPkPlayer) obj).getPosition() - 1 == ((long) i));
                }
            });
            if (multiCallCellTopView.m75821p0()) {
                multiCallCellTopView.m75830z0(multiPkPlayer, multiPk);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m75852y(MultiCallCellTopView multiCallCellTopView, BLiveMultiCall bLiveMultiCall, int i, String str) {
        multiCallCellTopView.m75826u0(bLiveMultiCall, this.f51416d, str);
        m75853z(bLiveMultiCall, multiCallCellTopView, str);
        if (NullChecker.m81303a(bLiveMultiCall)) {
            yi10.m214879a("renderSinGleCall:callId=" + bLiveMultiCall.f44400id + ",position=" + i + ",state=" + bLiveMultiCall.state);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m75853z(BLiveMultiCall bLiveMultiCall, MultiCallCellTopView multiCallCellTopView, String str) {
        if (bLiveMultiCall == null && this.f51420h) {
            this.f51420h = false;
            if (!this.f51416d.m174744h4()) {
                this.f51421i = false;
                m75841k();
                return;
            }
            this.f51419g = multiCallCellTopView;
            if (this.f51416d.m174746j4()) {
                this.f51419g.m75828w0(this.f51416d, true, str);
                this.f51416d.m174737H4(this.f51419g);
            } else {
                if (!this.f51421i) {
                    this.f51421i = true;
                    zi10.m218900n(this.f51416d.m174747k4());
                }
                this.f51419g.m75828w0(this.f51416d, false, str);
            }
        }
    }

    public MultiCallTopView(Context context) {
        super(context);
        this.f51420h = true;
        this.f51421i = false;
    }

    public MultiCallTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51420h = true;
        this.f51421i = false;
    }
}
