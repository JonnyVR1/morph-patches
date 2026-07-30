package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yti implements s7m<hui> {

    /* JADX INFO: renamed from: a */
    public VLinear f199929a;

    /* JADX INFO: renamed from: b */
    public View f199930b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f199931c;

    /* JADX INFO: renamed from: d */
    public VFrame f199932d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f199933e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f199934f;

    /* JADX INFO: renamed from: g */
    public VText f199935g;

    /* JADX INFO: renamed from: h */
    public VText f199936h;

    /* JADX INFO: renamed from: i */
    public ImageView f199937i;

    /* JADX INFO: renamed from: j */
    public VText f199938j;

    /* JADX INFO: renamed from: k */
    public VRelative f199939k;

    /* JADX INFO: renamed from: l */
    public VText f199940l;

    /* JADX INFO: renamed from: m */
    public VText f199941m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f199942n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f199943o;

    /* JADX INFO: renamed from: p */
    public VText f199944p;

    /* JADX INFO: renamed from: q */
    public VText f199945q;

    /* JADX INFO: renamed from: r */
    public VText f199946r;

    /* JADX INFO: renamed from: s */
    public hui f199947s;

    /* JADX INFO: renamed from: t */
    public DialogC12611a f199948t;

    /* JADX INFO: renamed from: u */
    public String f199949u;

    private void init() {
        byr byrVar = new byr(this.f199947s, m216021e(this.f199947s.act().inflater(), null));
        this.f199948t = byrVar;
        byrVar.m71778j0(LiveDialogEnum.FOLLOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m216019l(View view) {
        this.f199947s.m133106R3(this.f199938j.getText().toString(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m216020m(View view) {
        this.f199947s.m133106R3(this.f199938j.getText().toString(), false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m216021e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iui.m138406b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hui huiVar) {
        this.f199947s = huiVar;
    }

    /* JADX INFO: renamed from: i */
    public void m216023i() {
        if (isShowing()) {
            this.f199948t.dismiss();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12611a dialogC12611a = this.f199948t;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m216024j(View view) {
        m216023i();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m216025k(View view) {
        m216023i();
    }

    /* JADX INFO: renamed from: n */
    public final void m216026n(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        xdl0.m208344M(this.f199942n, true);
        xdl0.m208344M(this.f199931c, false);
        hxs.m133405r("context_single_room", this.f199943o, user.m60124fp().profileSmall());
        String str = ypv.f199493a.m199329V().name;
        if (str.length() > 8) {
            str = String.format("%s...", str.substring(0, 8));
        }
        this.f199944p.setText(String.format("%s%s%s", bLiveFollowRatePopupV2.titlePrefix, str, bLiveFollowRatePopupV2.titleSuffix));
        this.f199945q.setText(bLiveFollowRatePopupV2.text);
        this.f199946r.setText(uxi.m196180a(user.gender));
        this.f199946r.setBackgroundResource(i3c0.f111113o7);
        this.f199946r.setTextColor(Color.parseColor("#ffffff"));
        this.f199930b.setOnClickListener(new View.OnClickListener() { // from class: l.wti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188024a.m216024j(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m216027p(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        xdl0.m208344M(this.f199931c, true);
        xdl0.m208344M(this.f199942n, false);
        hxs.m133405r("context_single_room", this.f199933e, user.m60124fp().profileSmall());
        this.f199935g.setText(user.name);
        this.f199938j.setText(bLiveFollowRatePopupV2.text);
        this.f199936h.setText(String.valueOf(user.age));
        boolean zIsFemale = user.isFemale();
        ImageView imageView = this.f199937i;
        if (zIsFemale) {
            imageView.setImageResource(i3c0.f110940a2);
            this.f199937i.setBackgroundResource(i3c0.f111149r7);
        } else {
            imageView.setImageResource(i3c0.f110952b2);
            this.f199937i.setBackgroundResource(i3c0.f111161s7);
        }
        this.f199939k.setBackgroundResource(i3c0.f110650B0);
        this.f199940l.setText(uxi.m196180a(user.gender));
        this.f199930b.setOnClickListener(new View.OnClickListener() { // from class: l.xti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194391a.m216025k(view);
            }
        });
        xdl0.m208344M(this.f199941m, false);
        if (TextUtils.equals(this.f199949u, "ticker")) {
            this.f199941m.setText(ypv.f199497e.getString(R$string.f47663z0, Integer.valueOf(bLiveFollowRatePopupV2.tickerTime)));
            xdl0.m208344M(this.f199941m, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m216028q(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (user == null) {
            return;
        }
        this.f199949u = bLiveFollowRatePopupV2.type;
        if (this.f199948t == null) {
            init();
        }
        xdl0.m208329E0(this.f199939k, new View.OnClickListener() { // from class: l.uti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178270a.m216019l(view);
            }
        });
        xdl0.m208329E0(this.f199946r, new View.OnClickListener() { // from class: l.vti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182947a.m216020m(view);
            }
        });
        if (TextUtils.equals(bLiveFollowRatePopupV2.type, Constants.FLOAT)) {
            m216026n(user, bLiveFollowRatePopupV2);
        } else {
            m216027p(user, bLiveFollowRatePopupV2);
        }
        this.f199948t.show();
    }

    /* JADX INFO: renamed from: s */
    public void m216029s(Long l2) {
        if (this.f199948t == null) {
            return;
        }
        this.f199941m.setText(ypv.f199497e.getString(R$string.f47663z0, l2));
    }

    /* JADX INFO: renamed from: u */
    public final void m216030u() {
        this.f199946r.setBackgroundResource(i3c0.f110717G7);
        this.f199946r.setText(ypv.f199497e.getString(R$string.f46897Pe));
        xdl0.m208329E0(this.f199939k, null);
        xdl0.m208329E0(this.f199946r, null);
        this.f199946r.setTextColor(Color.parseColor("#d0d0d0"));
        this.f199946r.postDelayed(new tti(this), 1000L);
    }

    /* JADX INFO: renamed from: v */
    public void m216031v() {
        if (this.f199948t == null) {
            return;
        }
        if (TextUtils.equals(this.f199949u, Constants.FLOAT)) {
            m216030u();
        } else {
            m216032w();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m216032w() {
        xdl0.m208344M(this.f199941m, false);
        this.f199939k.setBackgroundResource(i3c0.f110916Y0);
        this.f199940l.setText(ypv.f199497e.getString(R$string.f46897Pe));
        xdl0.m208329E0(this.f199939k, null);
        xdl0.m208329E0(this.f199946r, null);
        this.f199940l.setTextColor(Color.parseColor("#40ffffff"));
        this.f199939k.postDelayed(new tti(this), 1000L);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
