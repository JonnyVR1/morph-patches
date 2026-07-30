package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryEditProfileFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemAvatarCardView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemAvatarView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemImagesView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemTagsView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemTextView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class yzw extends dzw<nzw> implements myl {

    /* JADX INFO: renamed from: A */
    public MarryEditProfileItemView f202231A;

    /* JADX INFO: renamed from: B */
    public MarryEditProfileItemTextView f202232B;

    /* JADX INFO: renamed from: C */
    public VText f202233C;

    /* JADX INFO: renamed from: D */
    public MarryEditProfileItemView f202234D;

    /* JADX INFO: renamed from: E */
    public VLinear f202235E;

    /* JADX INFO: renamed from: F */
    public VText f202236F;

    /* JADX INFO: renamed from: G */
    public VText f202237G;

    /* JADX INFO: renamed from: H */
    public MarryEditProfileFrag f202238H;

    /* JADX INFO: renamed from: I */
    public nzw f202239I;

    /* JADX INFO: renamed from: J */
    public List<oyl> f202240J;

    /* JADX INFO: renamed from: b */
    public ScrollView f202241b;

    /* JADX INFO: renamed from: c */
    public MarryEditProfileItemAvatarView f202242c;

    /* JADX INFO: renamed from: d */
    public MarryEditProfileItemAvatarCardView f202243d;

    /* JADX INFO: renamed from: e */
    public MarryEditProfileItemTextView f202244e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemImagesView f202245f;

    /* JADX INFO: renamed from: g */
    public VText f202246g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f202247h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f202248i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f202249j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemTagsView f202250k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileItemTextView f202251l;

    /* JADX INFO: renamed from: m */
    public MarryEditProfileItemTextView f202252m;

    /* JADX INFO: renamed from: n */
    public VText f202253n;

    /* JADX INFO: renamed from: o */
    public MarryEditProfileItemView f202254o;

    /* JADX INFO: renamed from: p */
    public MarryEditProfileItemView f202255p;

    /* JADX INFO: renamed from: q */
    public MarryEditProfileItemView f202256q;

    /* JADX INFO: renamed from: r */
    public MarryEditProfileItemView f202257r;

    /* JADX INFO: renamed from: s */
    public MarryEditProfileItemView f202258s;

    /* JADX INFO: renamed from: t */
    public VText f202259t;

    /* JADX INFO: renamed from: u */
    public MarryEditProfileItemView f202260u;

    /* JADX INFO: renamed from: v */
    public MarryEditProfileItemView f202261v;

    /* JADX INFO: renamed from: w */
    public MarryEditProfileItemView f202262w;

    /* JADX INFO: renamed from: x */
    public MarryEditProfileItemView f202263x;

    /* JADX INFO: renamed from: y */
    public MarryEditProfileItemView f202264y;

    /* JADX INFO: renamed from: z */
    public MarryEditProfileItemView f202265z;

    public yzw(MarryEditProfileFrag marryEditProfileFrag) {
        this.f202238H = marryEditProfileFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m218068r() {
        this.f91387a = true;
        this.f202246g.setTypeface(lyh0.m156283c(3), 1);
        this.f202259t.setTypeface(lyh0.m156283c(3), 1);
        this.f202233C.setTypeface(lyh0.m156283c(3), 1);
        this.f202253n.setTypeface(lyh0.m156283c(3), 1);
        ArrayList arrayList = new ArrayList();
        this.f202240J = arrayList;
        arrayList.add(this.f202244e.m48733h0(MarrySeriesType.DECLARATION));
        this.f202240J.add(this.f202245f.m48726h0(MarrySeriesType.LIFE_MOMENT));
        boolean zM212782a = xra.m212782a();
        List<oyl> list = this.f202240J;
        if (zM212782a) {
            list.add(this.f202243d.m48710u(MarrySeriesType.AVATAR));
        } else {
            list.add(this.f202242c.m48720v(MarrySeriesType.AVATAR));
        }
        this.f202240J.add(this.f202247h.m48734h0(MarrySeriesType.STATUS));
        this.f202240J.add(this.f202248i.m48734h0(MarrySeriesType.EXPECTED_TIME));
        this.f202240J.add(this.f202250k.m48730h0(MarrySeriesType.MATE));
        this.f202240J.add(this.f202251l.m48733h0(MarrySeriesType.FAMILY_BACKGROUND));
        this.f202240J.add(this.f202249j.m48734h0(MarrySeriesType.BABY_WILLING));
        this.f202240J.add(this.f202252m.m48733h0(MarrySeriesType.BRIDE_PRICE));
        this.f202240J.add(this.f202254o.m48734h0(MarrySeriesType.PROFESSION));
        this.f202240J.add(this.f202255p.m48734h0(MarrySeriesType.INCOME));
        this.f202240J.add(this.f202256q.m48734h0(MarrySeriesType.CAR));
        this.f202240J.add(this.f202257r.m48734h0(MarrySeriesType.HOUSE));
        this.f202240J.add(this.f202258s.m48734h0(MarrySeriesType.MONTHLY_COST));
        this.f202240J.add(this.f202260u.m48734h0(MarrySeriesType.QUALIFICATIONS));
        this.f202240J.add(this.f202261v.m48734h0(MarrySeriesType.ADDRESS_HOMETOWN));
        this.f202240J.add(this.f202262w.m48734h0(MarrySeriesType.ADDRESS_LIVE_NOW));
        this.f202240J.add(this.f202263x.m48734h0(MarrySeriesType.HEIGHT));
        this.f202240J.add(this.f202264y.m48734h0(MarrySeriesType.WEIGHT));
        this.f202240J.add(this.f202265z.m48734h0(MarrySeriesType.NICK_NAME));
        this.f202240J.add(this.f202231A.m48734h0(MarrySeriesType.BIRTHDAY));
        this.f202240J.add(this.f202232B.m48733h0(MarrySeriesType.PROLOGUE));
        this.f202240J.add(this.f202234D.m48734h0(MarrySeriesType.BIND_PHONE));
        for (final oyl oylVar : this.f202240J) {
            if (oylVar.mo48709f()) {
                bnl0.m105509E0(oylVar.getClickView(), new View.OnClickListener() { // from class: l.szw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f171430a.m218083s(oylVar, view);
                    }
                });
            }
        }
        if (xra.m212782a()) {
            this.f202243d.setMediaChangeCallback(new y20() { // from class: l.tzw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176825a.m218084u((List) obj);
                }
            });
            bnl0.m105524M(this.f202243d, true);
            bnl0.m105524M(this.f202242c, false);
        } else {
            this.f202242c.setMediaChangeCallback(new y20() { // from class: l.uzw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181816a.m218085v((List) obj);
                }
            });
            bnl0.m105524M(this.f202242c, true);
            bnl0.m105524M(this.f202243d, false);
        }
        bnl0.m105509E0(this.f202234D, new View.OnClickListener() { // from class: l.vzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186516a.m218069w(view);
            }
        });
        bnl0.m105509E0(this.f202236F, new View.OnClickListener() { // from class: l.wzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191833a.m218070x(view);
            }
        });
        bnl0.m105509E0(this.f202237G, new View.OnClickListener() { // from class: l.xzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196930a.m218071y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m218069w(View view) {
        if (TextUtils.isEmpty(this.f202234D.f31309f.getText())) {
            this.f202239I.m165406m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m218070x(View view) {
        this.f202239I.m165402i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m218071y(View view) {
        this.f202239I.m165403j0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m218072A(User user) {
        if (xra.m212782a()) {
            this.f202243d.f31270a.m51994h(0).m52961n0(user.picture(0));
        } else {
            this.f202242c.f31273a.m51994h(0).m51823C1(user.picture(0));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m218073B() {
        this.f202239I.m165401h0();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m218074C() {
        getAct().m48999H2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202238H.act();
    }

    /* JADX INFO: renamed from: E */
    public void m218075E(String str) {
        if (xra.m212782a()) {
            return;
        }
        this.f202242c.m48717B(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m218076F(int i, int i2, Intent intent) {
        if (xra.m212782a()) {
            return false;
        }
        this.f202242c.m48718C(i, i2, intent);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final void m218077G(final boolean z) {
        new th0.C20312a(getAct()).m191160s(getAct().getString(R$string.f28686d4)).m191148g(false).m191150i(R$string.f28680c4).m191158q(R$string.f28674b4).m191156o(new View.OnClickListener() { // from class: l.ozw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149966a.m218086z(z, view);
            }
        }).m191146e(R$string.f28663a).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: H */
    public final void m218078H(boolean z) {
        final User userM116589ma = CoreModule.f18264c.f20381e0.m116589ma();
        Picture picture = (Picture) (xra.m212782a() ? this.f202243d.f31270a.m51994h(0).getMedia() : this.f202242c.f31273a.m51994h(0).f33824N);
        Runnable runnable = new Runnable() { // from class: l.pzw
            @Override // java.lang.Runnable
            public final void run() {
                this.f154982a.m218072A(userM116589ma);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: l.qzw
            @Override // java.lang.Runnable
            public final void run() {
                this.f160311a.m218073B();
            }
        };
        Runnable runnable3 = new Runnable() { // from class: l.rzw
            @Override // java.lang.Runnable
            public final void run() {
                this.f165634a.m218074C();
            }
        };
        if (z) {
            new gp4(getAct(), userM116589ma.m61308fp(), picture, runnable, runnable2, runnable3).show();
        } else {
            new gp4(getAct(), userM116589ma.m61308fp(), picture, runnable, runnable2).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m218079I(MarrySeriesType marrySeriesType) {
        this.f202239I.m165400g0(marrySeriesType);
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: I0 */
    public boolean mo48630I0(User user, boolean z) {
        List<Media> allMedia = xra.m212782a() ? this.f202243d.getAllMedia() : this.f202242c.getAllMedia();
        ArrayList arrayList = new ArrayList();
        for (Media media : allMedia) {
            if (media != null && !TEnum.equals(media.status, "normal") && !z) {
                m218077G(true);
                return false;
            }
            if (media != null && TEnum.equals(media.status, "normal")) {
                arrayList.add(media);
            }
        }
        for (oyl oylVar : this.f202240J) {
            if ((oylVar.getItemType().isRequired() && !oylVar.mo48725d0()) || jyb.m147479J(arrayList)) {
                new th0.C20312a(getAct()).m191160s("还差一点就完成啦！").m191148g(true).m191143b(true).m191151j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").m191159r("继续填写").m191142a().m191141g();
                return false;
            }
        }
        if (!m218082q() || z) {
            user.pictures = arrayList;
            return super.mo48630I0(user, z);
        }
        m218078H(false);
        return false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f202238H.act();
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: d */
    public void mo48632d(User user) {
        Iterator<oyl> it = this.f202240J.iterator();
        while (it.hasNext()) {
            it.next().mo48708d(user);
        }
        this.f202234D.setContent(l5x.m153022s(user));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM218080n = m218080n(layoutInflater, viewGroup);
        m218068r();
        return viewM218080n;
    }

    /* JADX INFO: renamed from: n */
    public View m218080n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zzw.m222291b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nzw nzwVar) {
        this.f202239I = nzwVar;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m218082q() {
        if (xra.m212782a()) {
            this.f202243d.f31270a.m51994h(0).getMedia();
        } else {
            Media media = this.f202242c.f31273a.m51994h(0).f33824N;
        }
        return false;
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: r0 */
    public boolean mo48633r0(boolean z) {
        if (!z) {
            for (Media media : xra.m212782a() ? this.f202243d.getAllMedia() : this.f202242c.getAllMedia()) {
                if (media != null && !TEnum.equals(media.status, "normal")) {
                    m218077G(false);
                    return true;
                }
            }
        }
        if (z || !m218082q()) {
            return super.mo48633r0(z);
        }
        m218078H(true);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m218083s(oyl oylVar, View view) {
        m218079I(oylVar.getItemType());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m218084u(List list) {
        this.f202239I.m165407n0(list);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m218085v(List list) {
        this.f202239I.m165407n0(list);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m218086z(boolean z, View view) {
        if (z) {
            this.f202239I.m165401h0();
        } else {
            getAct().m48999H2();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
