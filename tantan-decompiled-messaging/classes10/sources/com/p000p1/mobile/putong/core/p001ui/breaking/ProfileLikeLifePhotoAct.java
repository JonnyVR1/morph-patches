package com.p000p1.mobile.putong.core.p001ui.breaking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.ProfileLikeComment;
import com.p000p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p000p1.mobile.putong.core.data.ProfileLikeType;
import com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeLifePhotoAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.soe;
import l.ura;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import p003l.a1c0;
import p003l.c3c0;
import p003l.ft90;
import p003l.szb0;
import rx.c;
import v.VDraweeView;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProfileLikeLifePhotoAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f1020d;

    /* JADX INFO: renamed from: e */
    public View f1021e;

    /* JADX INFO: renamed from: f */
    public VLinear f1022f;

    /* JADX INFO: renamed from: g */
    public VImage f1023g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f1024h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f1025i;

    /* JADX INFO: renamed from: j */
    public VText f1026j;

    /* JADX INFO: renamed from: k */
    public VText f1027k;

    /* JADX INFO: renamed from: l */
    public VEditText f1028l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f1029m;

    /* JADX INFO: renamed from: n */
    public String f1030n;

    /* JADX INFO: renamed from: o */
    public String f1031o;

    /* JADX INFO: renamed from: p */
    public String f1032p;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m1731A2(Boolean bool) {
        if (bool.booleanValue()) {
            setResult(-1);
            m1726h2();
            zvf0.u("e_send_compliment", pageId(), new j760[]{j760.a("to_uid", this.f1030n)});
            CoreModule.c.f0.Fo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m1732B2(View view) {
        String strTrim = this.f1028l.getText().toString().trim();
        final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f1030n;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        profileLikeCommentNew_.comment = TextUtils.isEmpty(strTrim) ? "赞了你的照片" : strTrim;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f1031o;
        profileLikeSnapshotNew_.title = "生活照";
        NewTags newTagsGh = ura.e().d().Gh(this.f1032p);
        profileLikeSnapshotNew_.desc = newTagsGh == null ? "" : newTagsGh.name;
        profileLikeSnapshotNew_.hasComment = !TextUtils.isEmpty(strTrim);
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        duringCreated(CoreModule.c.w2.b3(((Act) this).act, profileLikeCommentNew_.comment, DetectCategoryType.get("profile_comment")).flatMap(new w9j() { // from class: l.ct90
            public final Object call(Object obj) {
                return ProfileLikeLifePhotoAct.m1740s2(profileLikeCommentNew_, (Boolean) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.dt90
            public final void call(Object obj) {
                this.f4226a.m1731A2((Boolean) obj);
            }
        }, new e30() { // from class: l.et90
            public final void call(Object obj) {
                ProfileLikeLifePhotoAct.m1739r2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m1733d2(Bundle bundle) {
        m1738r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m1738r() {
        this.f1030n = getIntent().getStringExtra("user_id");
        this.f1031o = getIntent().getStringExtra("pic");
        this.f1032p = getIntent().getStringExtra("pic_tag");
        if (TextUtils.isEmpty(this.f1030n) || TextUtils.isEmpty(this.f1031o)) {
            m1726h2();
            return;
        }
        User userPa = CoreModule.c.e0.Pa(this.f1030n);
        if (userPa == null) {
            m1726h2();
            return;
        }
        this.f1027k.setText(String.format("夸夸%s的照片，开启聊天吧", userPa.getPronoun()));
        this.f1028l.setHint(String.format("夸夸%s的照片", userPa.getPronoun()));
        e51.H(this, new Runnable() { // from class: l.zs90
            @Override // java.lang.Runnable
            public final void run() {
                this.f9320a.m1743y2();
            }
        }, 200L);
        qib0.G.L0(this.f1025i, this.f1031o);
        xdl0.E0(this.f1023g, new View.OnClickListener() { // from class: l.at90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2874a.m1744z2(view);
            }
        });
        xdl0.E0(this.f1029m, new View.OnClickListener() { // from class: l.bt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3469a.m1732B2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m1739r2(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                osi0.g(tantanForbidden.message);
                return;
            }
        }
        yij0.D(th);
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ c m1740s2(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.c.K1.w3(profileLikeComment.toJson()) : c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w2 */
    public static void m1742w2(Act act, String str, String str2, String str3) {
        Intent intent = new Intent((Context) act, (Class<?>) ProfileLikeLifePhotoAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("pic", str2);
        intent.putExtra("pic_tag", str3);
        act.startActivityForResult(intent, 10111);
        act.overridePendingTransition(szb0.f7494e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m1743y2() {
        SVGALoader.with(((Act) this).act).from("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga").autoPlay(true).repeatCount(1).into(this.f1024h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m1744z2(View view) {
        m1726h2();
        zvf0.r("e_close_click", pageId());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: i2 */
    public View mo1727i2() {
        return this.f1021e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM1745v2 = m1745v2(layoutInflater, viewGroup);
        if (ura.e().d().I4()) {
            xdl0.N(this.f1023g, c3c0.f3845m7);
            this.f1026j.setTextColor(getResources().getColor(a1c0.f2701i));
            this.f1027k.setTextColor(getResources().getColor(a1c0.f2699g));
            this.f1029m.setTextColor(getResources().getColor(a1c0.f2702j));
            this.f1028l.setTextColor(getResources().getColor(a1c0.f2699g));
            this.f1028l.setHintTextColor(getResources().getColor(a1c0.f2701i));
            soe.a(this.f1028l);
        }
        return viewM1745v2;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ys90
            public final void call(Object obj) {
                this.f9115a.m1733d2((Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public ViewGroup mo1728k2() {
        return this.f1022f;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public EditText mo1729l2() {
        return this.f1028l;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public ViewGroup mo1730m2() {
        return this.f1020d;
    }

    public String pageId() {
        return "p_avatar_compliment_pop";
    }

    /* JADX INFO: renamed from: v2 */
    public View m1745v2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ft90.m6506b(this, layoutInflater, viewGroup);
    }
}
