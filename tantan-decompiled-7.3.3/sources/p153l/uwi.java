package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uwi implements iam<dxi> {

    /* JADX INFO: renamed from: a */
    public VLinear f181281a;

    /* JADX INFO: renamed from: b */
    public View f181282b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f181283c;

    /* JADX INFO: renamed from: d */
    public VFrame f181284d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f181285e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f181286f;

    /* JADX INFO: renamed from: g */
    public VText f181287g;

    /* JADX INFO: renamed from: h */
    public VText f181288h;

    /* JADX INFO: renamed from: i */
    public ImageView f181289i;

    /* JADX INFO: renamed from: j */
    public VText f181290j;

    /* JADX INFO: renamed from: k */
    public VRelative f181291k;

    /* JADX INFO: renamed from: l */
    public VText f181292l;

    /* JADX INFO: renamed from: m */
    public VText f181293m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f181294n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f181295o;

    /* JADX INFO: renamed from: p */
    public VText f181296p;

    /* JADX INFO: renamed from: q */
    public VText f181297q;

    /* JADX INFO: renamed from: r */
    public VText f181298r;

    /* JADX INFO: renamed from: s */
    public dxi f181299s;

    /* JADX INFO: renamed from: t */
    public DialogC12774a f181300t;

    /* JADX INFO: renamed from: u */
    public String f181301u;

    private void init() {
        c0s c0sVar = new c0s(this.f181299s, m198367e(this.f181299s.act().inflater(), null));
        this.f181300t = c0sVar;
        c0sVar.m72961j0(LiveDialogEnum.FOLLOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m198365l(View view) {
        this.f181299s.m118487R3(this.f181290j.getText().toString(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m198366m(View view) {
        this.f181299s.m118487R3(this.f181290j.getText().toString(), false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m198367e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return exi.m123055b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dxi dxiVar) {
        this.f181299s = dxiVar;
    }

    /* JADX INFO: renamed from: i */
    public void m198369i() {
        if (isShowing()) {
            this.f181300t.dismiss();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12774a dialogC12774a = this.f181300t;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m198370j(View view) {
        m198369i();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m198371k(View view) {
        m198369i();
    }

    /* JADX INFO: renamed from: n */
    public final void m198372n(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        bnl0.m105524M(this.f181294n, true);
        bnl0.m105524M(this.f181283c, false);
        izs.m142867r("context_single_room", this.f181295o, user.m61308fp().profileSmall());
        String str = zrv.f205799a.m207651V().name;
        if (str.length() > 8) {
            str = String.format("%s...", str.substring(0, 8));
        }
        this.f181296p.setText(String.format("%s%s%s", bLiveFollowRatePopupV2.titlePrefix, str, bLiveFollowRatePopupV2.titleSuffix));
        this.f181297q.setText(bLiveFollowRatePopupV2.text);
        this.f181298r.setText(q0j.m174710a(user.gender));
        this.f181298r.setBackgroundResource(obc0.f146441o7);
        this.f181298r.setTextColor(Color.parseColor("#ffffff"));
        this.f181282b.setOnClickListener(new View.OnClickListener() { // from class: l.swi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170978a.m198370j(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m198373p(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        bnl0.m105524M(this.f181283c, true);
        bnl0.m105524M(this.f181294n, false);
        izs.m142867r("context_single_room", this.f181285e, user.m61308fp().profileSmall());
        this.f181287g.setText(user.name);
        this.f181290j.setText(bLiveFollowRatePopupV2.text);
        this.f181288h.setText(String.valueOf(user.age));
        boolean zIsFemale = user.isFemale();
        ImageView imageView = this.f181289i;
        if (zIsFemale) {
            imageView.setImageResource(obc0.f146268a2);
            this.f181289i.setBackgroundResource(obc0.f146477r7);
        } else {
            imageView.setImageResource(obc0.f146280b2);
            this.f181289i.setBackgroundResource(obc0.f146489s7);
        }
        this.f181291k.setBackgroundResource(obc0.f145978B0);
        this.f181292l.setText(q0j.m174710a(user.gender));
        this.f181282b.setOnClickListener(new View.OnClickListener() { // from class: l.twi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176399a.m198371k(view);
            }
        });
        bnl0.m105524M(this.f181293m, false);
        if (TextUtils.equals(this.f181301u, "ticker")) {
            this.f181293m.setText(zrv.f205803e.getString(R$string.f48511z0, Integer.valueOf(bLiveFollowRatePopupV2.tickerTime)));
            bnl0.m105524M(this.f181293m, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m198374q(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (user == null) {
            return;
        }
        this.f181301u = bLiveFollowRatePopupV2.type;
        if (this.f181300t == null) {
            init();
        }
        bnl0.m105509E0(this.f181291k, new View.OnClickListener() { // from class: l.qwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159891a.m198365l(view);
            }
        });
        bnl0.m105509E0(this.f181298r, new View.OnClickListener() { // from class: l.rwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165142a.m198366m(view);
            }
        });
        if (TextUtils.equals(bLiveFollowRatePopupV2.type, Constants.FLOAT)) {
            m198372n(user, bLiveFollowRatePopupV2);
        } else {
            m198373p(user, bLiveFollowRatePopupV2);
        }
        this.f181300t.show();
    }

    /* JADX INFO: renamed from: s */
    public void m198375s(Long l2) {
        if (this.f181300t == null) {
            return;
        }
        this.f181293m.setText(zrv.f205803e.getString(R$string.f48511z0, l2));
    }

    /* JADX INFO: renamed from: u */
    public final void m198376u() {
        this.f181298r.setBackgroundResource(obc0.f146045G7);
        this.f181298r.setText(zrv.f205803e.getString(R$string.f47745Pe));
        bnl0.m105509E0(this.f181291k, null);
        bnl0.m105509E0(this.f181298r, null);
        this.f181298r.setTextColor(Color.parseColor("#d0d0d0"));
        this.f181298r.postDelayed(new pwi(this), 1000L);
    }

    /* JADX INFO: renamed from: v */
    public void m198377v() {
        if (this.f181300t == null) {
            return;
        }
        if (TextUtils.equals(this.f181301u, Constants.FLOAT)) {
            m198376u();
        } else {
            m198378w();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m198378w() {
        bnl0.m105524M(this.f181293m, false);
        this.f181291k.setBackgroundResource(obc0.f146244Y0);
        this.f181292l.setText(zrv.f205803e.getString(R$string.f47745Pe));
        bnl0.m105509E0(this.f181291k, null);
        bnl0.m105509E0(this.f181298r, null);
        this.f181292l.setTextColor(Color.parseColor("#40ffffff"));
        this.f181291k.postDelayed(new pwi(this), 1000L);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
