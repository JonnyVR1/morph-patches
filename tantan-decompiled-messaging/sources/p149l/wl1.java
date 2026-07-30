package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class wl1 extends jq2<em1> {

    /* JADX INFO: renamed from: a */
    public String f186856a;

    /* JADX INFO: renamed from: b */
    public int f186857b;

    /* JADX INFO: renamed from: c */
    public lrj0 f186858c;

    /* JADX INFO: renamed from: d */
    public C22392a<lrj0.C18309b> f186859d;

    public wl1(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m203709C0(Integer num) {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: t0 */
    private void m203720t0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().m66873d2();
        } else {
            this.f186857b = extras.getInt("type");
            this.f186856a = extras.getString("from");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m203721z0(Bundle bundle) {
        ((em1) this.viewModel).m117191r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m203722A0(lrj0.C18309b c18309b) {
        ((em1) this.viewModel).m117194z(c18309b);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m203723D0(roj0 roj0Var) {
        act().progressDismiss();
        m203731s0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m203724E0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public void m203725F0() {
        final lrj0.C18309b c18309bM221515e = this.f186859d.m221515e();
        if (wn90.m204602F().f187269a != null && !vwb.m200296J(wn90.m204602F().f187269a.pictures)) {
            wn90.m204602F().f187269a.pictures.set(0, c18309bM221515e.f129725b);
        }
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        User userMo223809clone2 = userMo223809clone.mo223809clone();
        vwb.m200322e0(userMo223809clone.pictures, new w9j() { // from class: l.tl1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).cover().url.equals(c18309bM221515e.f129725b.cover().url));
            }
        });
        boolean zIsEmpty = userMo223809clone.pictures.isEmpty();
        List<Media> list = userMo223809clone.pictures;
        if (zIsEmpty) {
            list.add(c18309bM221515e.f129725b);
        } else {
            list.set(0, c18309bM221515e.f129725b);
        }
        User userSubtract = userMo223809clone.subtract(userMo223809clone2);
        if (userSubtract == null) {
            m203731s0();
        } else {
            act().progress(R$string.f17842J5);
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.ul1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177006a.m203723D0((roj0) obj);
                }
            }, new e30() { // from class: l.vl1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181874a.m203724E0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m203726G0() {
        List<Media> listM203728p0 = m203728p0();
        int i = 0;
        while (true) {
            int size = listM203728p0.size();
            V v2 = this.viewModel;
            if (i >= size) {
                ((em1) v2).m117188l(TextUtils.isEmpty(this.f186859d.m221515e().f129726c));
                return;
            } else {
                ((em1) v2).m117185A(i, TextUtils.equals(this.f186859d.m221515e().f129725b.url, listM203728p0.get(i).url));
                i++;
            }
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        m203720t0();
        super.mo39469Z();
        m203732u0();
        creates(new e30() { // from class: l.ml1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134401a.m203721z0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(this.f186859d.observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.nl1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139500a.m203722A0((lrj0.C18309b) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.ol1
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return rwk0.f161352b;
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.pl1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150051a.m203709C0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m203727o0() {
        lrj0.C18308a c18308a = new lrj0.C18308a();
        c18308a.m151486h(AvatarUpdateCheckType.LOCAL_CHECK);
        c18308a.m151486h(AvatarUpdateCheckType.REMOTE_CHECK);
        c18308a.m151492n(AvatarUpdateType.AVATAR);
        c18308a.m151491m("verification");
        this.f186858c.m151446J0(act(), c18308a, this.f186859d);
    }

    /* JADX INFO: renamed from: p0 */
    public List<Media> m203728p0() {
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        return new ArrayList(pc8.m168318v0(vwb.m200339n(arrayList, new w9j() { // from class: l.ql1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.RECOMMEND)));
            }
        }), 3));
    }

    /* JADX INFO: renamed from: q0 */
    public String m203729q0() {
        int i = this.f186857b;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: r0 */
    public void m203730r0() {
        lrj0.C18309b c18309bM221515e = this.f186859d.m221515e();
        String str = vwb.m200337m(m203728p0(), new w9j() { // from class: l.rl1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159921a.m203733x0((Media) obj);
            }
        }) ? "recommend" : ProfileLikeModuleType.album;
        if (c18309bM221515e.f129724a.isLoading()) {
            lsi0.m151595y("照片上传中...");
            zvf0.m220399u("e_save_photo_continue_verify", "p_change_avatar_verification", j760.m140076a("photo_status", "uploading"), j760.m140076a("avatar_photo_source", str));
            return;
        }
        if (!c18309bM221515e.f129729f && c18309bM221515e.f129728e) {
            lsi0.m151595y("照片上传失败，请更换头像后尝试");
            zvf0.m220399u("e_save_photo_continue_verify", "p_change_avatar_verification", j760.m140076a("photo_status", "upload_failed"), j760.m140076a("avatar_photo_source", str));
        } else if (!TextUtils.isEmpty(c18309bM221515e.f129726c)) {
            lsi0.m151595y("照片未识别到单人清晰正脸，请更换头像后尝试");
            zvf0.m220399u("e_save_photo_continue_verify", "p_change_avatar_verification", j760.m140076a("photo_status", "image_quality"), j760.m140076a("avatar_photo_source", str));
        } else if (((em1) this.viewModel).m117189p()) {
            zvf0.m220399u("e_save_photo_continue_verify", "p_change_avatar_verification", j760.m140076a("photo_status", "default"), j760.m140076a("avatar_photo_source", str));
            m203725F0();
        } else {
            qp4.m175804j(act(), true, new Runnable() { // from class: l.sl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165054a.m203734y0();
                }
            });
            zvf0.m220399u("e_save_photo_continue_verify", "p_change_avatar_verification", j760.m140076a("photo_status", "privacy_agreement"), j760.m140076a("avatar_photo_source", str));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m203731s0() {
        int i = this.f186857b;
        if (i == 1) {
            tvf.m190731i(act(), this.f186856a, false, true);
        } else {
            if (i != 2) {
                return;
            }
            zbi0.m217857F(act(), true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m203732u0() {
        lrj0 lrj0Var = new lrj0();
        this.f186858c = lrj0Var;
        this.f186859d = lrj0Var.m151455c0();
        lrj0.C18309b c18309b = new lrj0.C18309b();
        c18309b.f129725b = CoreModule.f17545c.f19639e0.m169516ma().m60124fp();
        c18309b.f129726c = "五官不清晰";
        c18309b.f129729f = true;
        this.f186859d.onNext(c18309b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m203733x0(Media media) {
        return Boolean.valueOf(TextUtils.equals(media.cover().url, this.f186859d.m221515e().f129725b.url));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m203734y0() {
        ((em1) this.viewModel).f92177s.setChecked(true);
        m203725F0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
