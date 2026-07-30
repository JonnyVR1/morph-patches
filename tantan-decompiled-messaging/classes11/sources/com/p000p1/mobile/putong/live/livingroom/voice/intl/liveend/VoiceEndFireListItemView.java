package com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.h1c0;
import l.i3c0;
import l.j760;
import l.mqv;
import l.n4n0;
import l.osi0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.wk3;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p009l.won0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceEndFireListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6842a;

    /* JADX INFO: renamed from: b */
    public TextView f6843b;

    /* JADX INFO: renamed from: c */
    public TextView f6844c;

    /* JADX INFO: renamed from: d */
    public TextView f6845d;

    /* JADX INFO: renamed from: e */
    public won0 f6846e;

    /* JADX INFO: renamed from: f */
    public mqv<User> f6847f;

    /* JADX INFO: renamed from: g */
    public xh0 f6848g;

    /* JADX INFO: renamed from: h */
    public boolean f6849h;

    /* JADX INFO: renamed from: i */
    public String f6850i;

    /* JADX INFO: renamed from: j */
    public Drawable f6851j;

    /* JADX INFO: renamed from: k */
    public String f6852k;

    public VoiceEndFireListItemView(Context context) {
        super(context);
    }

    private void setFollowAction(final String str) {
        this.f6846e.m24439L0(this.f6847f, "", this.f6849h, new e30() { // from class: l.g4n0
            public final void call(Object obj) {
                this.f13306a.m8435k(str, (Boolean) obj);
            }
        });
    }

    private void setListBtnStyleParam(String str) {
        str.getClass();
        switch (str) {
            case "unfollow":
                this.f6852k = "unfollow";
                this.f6850i = getContext().getString(R.string.D4);
                won0 won0Var = this.f6846e;
                if (won0Var != null && won0Var.m24449z0()) {
                    this.f6850i = "喜欢";
                }
                this.f6851j = getContext().getDrawable(i3c0.p0);
                break;
            case "followed":
                this.f6852k = "followed";
                this.f6850i = getContext().getString(R.string.Bg);
                won0 won0Var2 = this.f6846e;
                if (won0Var2 != null && won0Var2.m24449z0()) {
                    this.f6850i = "喜欢";
                }
                this.f6851j = getContext().getDrawable(i3c0.p0);
                break;
            case "following":
                this.f6852k = "following";
                this.f6850i = getContext().getString(R.string.o);
                won0 won0Var3 = this.f6846e;
                if (won0Var3 != null && won0Var3.m24449z0()) {
                    this.f6850i = "已喜欢";
                }
                this.f6851j = getContext().getDrawable(i3c0.V0);
                break;
            case "followMatched":
                this.f6852k = "followMatched";
                this.f6850i = getContext().getString(R.string.Xh);
                won0 won0Var4 = this.f6846e;
                if (won0Var4 != null && won0Var4.m24449z0()) {
                    this.f6850i = "相互喜欢";
                }
                this.f6851j = getContext().getDrawable(i3c0.V0);
                break;
            default:
                this.f6850i = "";
                this.f6851j = null;
                this.f6852k = "";
                break;
        }
        m8438n(this.f6852k, this.f6850i, this.f6851j);
    }

    /* JADX INFO: renamed from: h */
    public final void m8432h(View view) {
        n4n0.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m8433i(String str) {
        str.getClass();
        if (str.equals("likeMatched")) {
            return "followMatched";
        }
        return !str.equals("liking") ? "unfollow" : "followed";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8434j(String str, String str2, View view) {
        String string = this.f6845d.getTag().toString();
        string.getClass();
        switch (string) {
            case "unfollow":
                this.f6849h = true;
                setFollowAction("unfollow");
                break;
            case "followed":
                this.f6849h = true;
                setFollowAction("followed");
                break;
            case "following":
                this.f6849h = false;
                m8440p("following");
                break;
            case "followMatched":
                this.f6849h = false;
                m8440p("followMatched");
                break;
        }
        m8441q(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8435k(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            osi0.f(R.string.G9);
            return;
        }
        str.getClass();
        switch (str) {
            case "unfollow":
                setListBtnStyleParam("following");
                break;
            case "followed":
                setListBtnStyleParam("followMatched");
                break;
            case "following":
                setListBtnStyleParam("unfollow");
                break;
            case "followMatched":
                setListBtnStyleParam("followed");
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8436l(String str, View view) {
        setFollowAction(str);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8437m(View view) {
        this.f6848g.c();
    }

    /* JADX INFO: renamed from: n */
    public final void m8438n(String str, String str2, Drawable drawable) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || drawable == null) {
            xdl0.M(this.f6845d, false);
            return;
        }
        this.f6845d.setTag(str);
        this.f6845d.setText(str2);
        this.f6845d.setBackground(drawable);
        xdl0.M(this.f6845d, true);
    }

    /* JADX INFO: renamed from: o */
    public void m8439o(final won0 won0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, final mqv<User> mqvVar, final String str, final String str2) {
        this.f6846e = won0Var;
        this.f6847f = mqvVar;
        wk3.c(this.f6842a, mqvVar, new w9j() { // from class: l.h4n0
            public final Object call(Object obj) {
                return ((User) obj).fp().profileSmall().formatted();
            }
        });
        this.f6843b.setText(((User) mqvVar.a).name);
        this.f6844c.setText(w8u.u(R.string.rf, Integer.valueOf((int) (bLiveVoiceEndSparkRanking.accompanyDuration / 60.0d))));
        if (won0Var.m24449z0()) {
            setListBtnStyleParam(m8433i(bLiveVoiceEndSparkRanking.relationState));
        } else {
            setListBtnStyleParam(bLiveVoiceEndSparkRanking.followRelation);
        }
        this.f6842a.setOnClickListener(new View.OnClickListener() { // from class: l.i4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                won0Var.m24437I0(mqvVar);
            }
        });
        this.f6843b.setOnClickListener(new View.OnClickListener() { // from class: l.j4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                won0Var.m24437I0(mqvVar);
            }
        });
        this.f6845d.setOnClickListener(new View.OnClickListener() { // from class: l.k4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15409a.m8434j(str, str2, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8432h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m8440p(final String str) {
        if (this.f6846e.m24449z0()) {
            setFollowAction(str);
            return;
        }
        xh0.a aVar = new xh0.a(this.f6846e.act());
        aVar.j(this.f6846e.act().getResources().getString(R.string.Ag)).q(R.string.d).p(h1c0.d).o(new View.OnClickListener() { // from class: l.l4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15937a.m8436l(str, view);
            }
        }).e(R.string.a).c(new View.OnClickListener() { // from class: l.m4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16499a.m8437m(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f6848g = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: q */
    public final void m8441q(String str, String str2) {
        if (this.f6846e.m24449z0()) {
            zvf0.u("e_audio_anonymous_follow", "p_anchor_live_end", new j760[]{vwb.Y("anchorId", str), vwb.Y("liveId", str2), vwb.Y("liveFollow_from", "live_audio_end"), vwb.Y("liveStatus", "off"), vwb.Y("receiver_user_id", ((DbObject) ((User) this.f6847f.a)).id)});
        } else {
            zvf0.u("e_follow", "p_anchor_live_end", new j760[]{vwb.Y("anchorId", str), vwb.Y("liveId", str2), vwb.Y("liveFollow_from", "live_audio_end"), vwb.Y("liveStatus", "endLive"), vwb.Y("receiver_user_id", ((DbObject) ((User) this.f6847f.a)).id)});
        }
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceEndFireListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
