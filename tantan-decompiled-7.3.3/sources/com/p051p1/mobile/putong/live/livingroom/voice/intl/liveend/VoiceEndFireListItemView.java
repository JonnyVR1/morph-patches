package com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p153l.ayn0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qcj;
import p153l.ql3;
import p153l.r1j0;
import p153l.rdn0;
import p153l.th0;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceEndFireListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54084a;

    /* JADX INFO: renamed from: b */
    public TextView f54085b;

    /* JADX INFO: renamed from: c */
    public TextView f54086c;

    /* JADX INFO: renamed from: d */
    public TextView f54087d;

    /* JADX INFO: renamed from: e */
    public ayn0 f54088e;

    /* JADX INFO: renamed from: f */
    public nsv<User> f54089f;

    /* JADX INFO: renamed from: g */
    public th0 f54090g;

    /* JADX INFO: renamed from: h */
    public boolean f54091h;

    /* JADX INFO: renamed from: i */
    public String f54092i;

    /* JADX INFO: renamed from: j */
    public Drawable f54093j;

    /* JADX INFO: renamed from: k */
    public String f54094k;

    public VoiceEndFireListItemView(Context context) {
        super(context);
    }

    private void setFollowAction(final String str) {
        this.f54088e.m100902L0(this.f54089f, "", this.f54091h, new y20() { // from class: l.kdn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125267a.m79429k(str, (Boolean) obj);
            }
        });
    }

    private void setListBtnStyleParam(String str) {
        str.getClass();
        switch (str) {
            case "unfollow":
                this.f54094k = FollowshipStatus.unfollow;
                this.f54092i = getContext().getString(R$string.f47475D4);
                ayn0 ayn0Var = this.f54088e;
                if (ayn0Var != null && ayn0Var.m100911z0()) {
                    this.f54092i = "喜欢";
                }
                this.f54093j = getContext().getDrawable(obc0.f146446p0);
                break;
            case "followed":
                this.f54094k = FollowshipStatus.followed;
                this.f54092i = getContext().getString(R$string.f47443Bg);
                ayn0 ayn0Var2 = this.f54088e;
                if (ayn0Var2 != null && ayn0Var2.m100911z0()) {
                    this.f54092i = "喜欢";
                }
                this.f54093j = getContext().getDrawable(obc0.f146446p0);
                break;
            case "following":
                this.f54094k = FollowshipStatus.following;
                this.f54092i = getContext().getString(R$string.f48268o);
                ayn0 ayn0Var3 = this.f54088e;
                if (ayn0Var3 != null && ayn0Var3.m100911z0()) {
                    this.f54092i = "已喜欢";
                }
                this.f54093j = getContext().getDrawable(obc0.f146211V0);
                break;
            case "followMatched":
                this.f54094k = "followMatched";
                this.f54092i = getContext().getString(R$string.f47916Xh);
                ayn0 ayn0Var4 = this.f54088e;
                if (ayn0Var4 != null && ayn0Var4.m100911z0()) {
                    this.f54092i = "相互喜欢";
                }
                this.f54093j = getContext().getDrawable(obc0.f146211V0);
                break;
            default:
                this.f54092i = "";
                this.f54093j = null;
                this.f54094k = "";
                break;
        }
        m79432n(this.f54094k, this.f54092i, this.f54093j);
    }

    /* JADX INFO: renamed from: h */
    public final void m79426h(View view) {
        rdn0.m180868a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m79427i(String str) {
        str.getClass();
        if (str.equals("likeMatched")) {
            return "followMatched";
        }
        return !str.equals("liking") ? FollowshipStatus.unfollow : FollowshipStatus.followed;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m79428j(String str, String str2, View view) {
        String string = this.f54087d.getTag().toString();
        string.getClass();
        switch (string) {
            case "unfollow":
                this.f54091h = true;
                setFollowAction(FollowshipStatus.unfollow);
                break;
            case "followed":
                this.f54091h = true;
                setFollowAction(FollowshipStatus.followed);
                break;
            case "following":
                this.f54091h = false;
                m79434p(FollowshipStatus.following);
                break;
            case "followMatched":
                this.f54091h = false;
                m79434p("followMatched");
                break;
        }
        m79435q(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m79429k(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            r1j0.m179419f(R$string.f47546G9);
            return;
        }
        str.getClass();
        switch (str) {
            case "unfollow":
                setListBtnStyleParam(FollowshipStatus.following);
                break;
            case "followed":
                setListBtnStyleParam("followMatched");
                break;
            case "following":
                setListBtnStyleParam(FollowshipStatus.unfollow);
                break;
            case "followMatched":
                setListBtnStyleParam(FollowshipStatus.followed);
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m79430l(String str, View view) {
        setFollowAction(str);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m79431m(View view) {
        this.f54090g.m191137c();
    }

    /* JADX INFO: renamed from: n */
    public final void m79432n(String str, String str2, Drawable drawable) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || drawable == null) {
            bnl0.m105524M(this.f54087d, false);
            return;
        }
        this.f54087d.setTag(str);
        this.f54087d.setText(str2);
        this.f54087d.setBackground(drawable);
        bnl0.m105524M(this.f54087d, true);
    }

    /* JADX INFO: renamed from: o */
    public void m79433o(final ayn0 ayn0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, final nsv<User> nsvVar, final String str, final String str2) {
        this.f54088e = ayn0Var;
        this.f54089f = nsvVar;
        ql3.m176985c(this.f54084a, nsvVar, new qcj() { // from class: l.ldn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        this.f54085b.setText(nsvVar.f143542a.name);
        this.f54086c.setText(xau.m209911u(R$string.f48350rf, Integer.valueOf((int) (bLiveVoiceEndSparkRanking.accompanyDuration / 60.0d))));
        if (ayn0Var.m100911z0()) {
            setListBtnStyleParam(m79427i(bLiveVoiceEndSparkRanking.relationState));
        } else {
            setListBtnStyleParam(bLiveVoiceEndSparkRanking.followRelation);
        }
        this.f54084a.setOnClickListener(new View.OnClickListener() { // from class: l.mdn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ayn0Var.m100900I0(nsvVar);
            }
        });
        this.f54085b.setOnClickListener(new View.OnClickListener() { // from class: l.ndn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ayn0Var.m100900I0(nsvVar);
            }
        });
        this.f54087d.setOnClickListener(new View.OnClickListener() { // from class: l.odn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146931a.m79428j(str, str2, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79426h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m79434p(final String str) {
        if (this.f54088e.m100911z0()) {
            setFollowAction(str);
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(this.f54088e.act());
        c20312a.m191151j(this.f54088e.act().getResources().getString(R$string.f47421Ag)).m191158q(R$string.f48027d).m191157p(n9c0.f140818d).m191156o(new View.OnClickListener() { // from class: l.pdn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151816a.m79430l(str, view);
            }
        }).m191146e(R$string.f47961a).m191144c(new View.OnClickListener() { // from class: l.qdn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156751a.m79431m(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f54090g = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: q */
    public final void m79435q(String str, String str2) {
        if (this.f54088e.m100911z0()) {
            i4g0.m138523u("e_audio_anonymous_follow", "p_anchor_live_end", jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", str2), jyb.m147494Y("liveFollow_from", "live_audio_end"), jyb.m147494Y("liveStatus", BLiveOperationTitleShowType.off), jyb.m147494Y("receiver_user_id", this.f54089f.f143542a.f56859id));
        } else {
            i4g0.m138523u(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", str2), jyb.m147494Y("liveFollow_from", "live_audio_end"), jyb.m147494Y("liveStatus", "endLive"), jyb.m147494Y("receiver_user_id", this.f54089f.f143542a.f56859id));
        }
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
