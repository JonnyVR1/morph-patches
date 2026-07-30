package com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p149l.e30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.mqv;
import p149l.n4n0;
import p149l.osi0;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.wk3;
import p149l.won0;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceEndFireListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53236a;

    /* JADX INFO: renamed from: b */
    public TextView f53237b;

    /* JADX INFO: renamed from: c */
    public TextView f53238c;

    /* JADX INFO: renamed from: d */
    public TextView f53239d;

    /* JADX INFO: renamed from: e */
    public won0 f53240e;

    /* JADX INFO: renamed from: f */
    public mqv<User> f53241f;

    /* JADX INFO: renamed from: g */
    public xh0 f53242g;

    /* JADX INFO: renamed from: h */
    public boolean f53243h;

    /* JADX INFO: renamed from: i */
    public String f53244i;

    /* JADX INFO: renamed from: j */
    public Drawable f53245j;

    /* JADX INFO: renamed from: k */
    public String f53246k;

    public VoiceEndFireListItemView(Context context) {
        super(context);
    }

    private void setFollowAction(final String str) {
        this.f53240e.m204844L0(this.f53241f, "", this.f53243h, new e30() { // from class: l.g4n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100576a.m78246k(str, (Boolean) obj);
            }
        });
    }

    private void setListBtnStyleParam(String str) {
        str.getClass();
        switch (str) {
            case "unfollow":
                this.f53246k = FollowshipStatus.unfollow;
                this.f53244i = getContext().getString(R$string.f46627D4);
                won0 won0Var = this.f53240e;
                if (won0Var != null && won0Var.m204853z0()) {
                    this.f53244i = "喜欢";
                }
                this.f53245j = getContext().getDrawable(i3c0.f111118p0);
                break;
            case "followed":
                this.f53246k = FollowshipStatus.followed;
                this.f53244i = getContext().getString(R$string.f46595Bg);
                won0 won0Var2 = this.f53240e;
                if (won0Var2 != null && won0Var2.m204853z0()) {
                    this.f53244i = "喜欢";
                }
                this.f53245j = getContext().getDrawable(i3c0.f111118p0);
                break;
            case "following":
                this.f53246k = FollowshipStatus.following;
                this.f53244i = getContext().getString(R$string.f47420o);
                won0 won0Var3 = this.f53240e;
                if (won0Var3 != null && won0Var3.m204853z0()) {
                    this.f53244i = "已喜欢";
                }
                this.f53245j = getContext().getDrawable(i3c0.f110883V0);
                break;
            case "followMatched":
                this.f53246k = "followMatched";
                this.f53244i = getContext().getString(R$string.f47068Xh);
                won0 won0Var4 = this.f53240e;
                if (won0Var4 != null && won0Var4.m204853z0()) {
                    this.f53244i = "相互喜欢";
                }
                this.f53245j = getContext().getDrawable(i3c0.f110883V0);
                break;
            default:
                this.f53244i = "";
                this.f53245j = null;
                this.f53246k = "";
                break;
        }
        m78249n(this.f53246k, this.f53244i, this.f53245j);
    }

    /* JADX INFO: renamed from: h */
    public final void m78243h(View view) {
        n4n0.m157883a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m78244i(String str) {
        str.getClass();
        if (str.equals("likeMatched")) {
            return "followMatched";
        }
        return !str.equals("liking") ? FollowshipStatus.unfollow : FollowshipStatus.followed;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m78245j(String str, String str2, View view) {
        String string = this.f53239d.getTag().toString();
        string.getClass();
        switch (string) {
            case "unfollow":
                this.f53243h = true;
                setFollowAction(FollowshipStatus.unfollow);
                break;
            case "followed":
                this.f53243h = true;
                setFollowAction(FollowshipStatus.followed);
                break;
            case "following":
                this.f53243h = false;
                m78251p(FollowshipStatus.following);
                break;
            case "followMatched":
                this.f53243h = false;
                m78251p("followMatched");
                break;
        }
        m78252q(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m78246k(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            osi0.m165782f(R$string.f46698G9);
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
    public final /* synthetic */ void m78247l(String str, View view) {
        setFollowAction(str);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m78248m(View view) {
        this.f53242g.m208717c();
    }

    /* JADX INFO: renamed from: n */
    public final void m78249n(String str, String str2, Drawable drawable) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || drawable == null) {
            xdl0.m208344M(this.f53239d, false);
            return;
        }
        this.f53239d.setTag(str);
        this.f53239d.setText(str2);
        this.f53239d.setBackground(drawable);
        xdl0.m208344M(this.f53239d, true);
    }

    /* JADX INFO: renamed from: o */
    public void m78250o(final won0 won0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, final mqv<User> mqvVar, final String str, final String str2) {
        this.f53240e = won0Var;
        this.f53241f = mqvVar;
        wk3.m203644c(this.f53236a, mqvVar, new w9j() { // from class: l.h4n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        this.f53237b.setText(mqvVar.f135304a.name);
        this.f53238c.setText(w8u.m202218u(R$string.f47502rf, Integer.valueOf((int) (bLiveVoiceEndSparkRanking.accompanyDuration / 60.0d))));
        if (won0Var.m204853z0()) {
            setListBtnStyleParam(m78244i(bLiveVoiceEndSparkRanking.relationState));
        } else {
            setListBtnStyleParam(bLiveVoiceEndSparkRanking.followRelation);
        }
        this.f53236a.setOnClickListener(new View.OnClickListener() { // from class: l.i4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                won0Var.m204842I0(mqvVar);
            }
        });
        this.f53237b.setOnClickListener(new View.OnClickListener() { // from class: l.j4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                won0Var.m204842I0(mqvVar);
            }
        });
        this.f53239d.setOnClickListener(new View.OnClickListener() { // from class: l.k4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121112a.m78245j(str, str2, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78243h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m78251p(final String str) {
        if (this.f53240e.m204853z0()) {
            setFollowAction(str);
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(this.f53240e.act());
        c21150a.m208731j(this.f53240e.act().getResources().getString(R$string.f46573Ag)).m208738q(R$string.f47179d).m208737p(h1c0.f105357d).m208736o(new View.OnClickListener() { // from class: l.l4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126046a.m78247l(str, view);
            }
        }).m208726e(R$string.f47113a).m208724c(new View.OnClickListener() { // from class: l.m4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131310a.m78248m(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f53242g = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: q */
    public final void m78252q(String str, String str2) {
        if (this.f53240e.m204853z0()) {
            zvf0.m220399u("e_audio_anonymous_follow", "p_anchor_live_end", vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", str2), vwb.m200311Y("liveFollow_from", "live_audio_end"), vwb.m200311Y("liveStatus", BLiveOperationTitleShowType.off), vwb.m200311Y("receiver_user_id", this.f53241f.f135304a.f56011id));
        } else {
            zvf0.m220399u(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", str2), vwb.m200311Y("liveFollow_from", "live_audio_end"), vwb.m200311Y("liveStatus", "endLive"), vwb.m200311Y("receiver_user_id", this.f53241f.f135304a.f56011id));
        }
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
