package com.p046p1.mobile.putong.core.p053ui.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeLifePhotoAct;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.connect.common.Constants;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.e51;
import p149l.ft90;
import p149l.j760;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.soe;
import p149l.szb0;
import p149l.ura;
import p149l.w9j;
import p149l.xdl0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ProfileLikeLifePhotoAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f28626d;

    /* JADX INFO: renamed from: e */
    public View f28627e;

    /* JADX INFO: renamed from: f */
    public VLinear f28628f;

    /* JADX INFO: renamed from: g */
    public VImage f28629g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f28630h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f28631i;

    /* JADX INFO: renamed from: j */
    public VText f28632j;

    /* JADX INFO: renamed from: k */
    public VText f28633k;

    /* JADX INFO: renamed from: l */
    public VEditText f28634l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f28635m;

    /* JADX INFO: renamed from: n */
    public String f28636n;

    /* JADX INFO: renamed from: o */
    public String f28637o;

    /* JADX INFO: renamed from: p */
    public String f28638p;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m44432A2(Boolean bool) {
        if (bool.booleanValue()) {
            setResult(-1);
            m44427h2();
            zvf0.m220399u("e_send_compliment", pageId(), j760.m140076a("to_uid", this.f28636n));
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m44433B2(View view) {
        String strTrim = this.f28634l.getText().toString().trim();
        final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f28636n;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        profileLikeCommentNew_.comment = TextUtils.isEmpty(strTrim) ? "赞了你的照片" : strTrim;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f28637o;
        profileLikeSnapshotNew_.title = "生活照";
        NewTags newTagsMo33691Gh = ura.m195053e().m195057d().mo33691Gh(this.f28638p);
        profileLikeSnapshotNew_.desc = newTagsMo33691Gh == null ? "" : newTagsMo33691Gh.name;
        profileLikeSnapshotNew_.hasComment = !TextUtils.isEmpty(strTrim);
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        duringCreated((C22306c) CoreModule.f17545c.f19695w2.m165738b3(this.act, profileLikeCommentNew_.comment, DetectCategoryType.get(DetectCategoryType.profile_comment)).flatMap(new w9j() { // from class: l.ct90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLikeLifePhotoAct.m44441s2(profileLikeCommentNew_, (Boolean) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.dt90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87827a.m44432A2((Boolean) obj);
            }
        }, new e30() { // from class: l.et90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileLikeLifePhotoAct.m44440r2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m44434d2(Bundle bundle) {
        m44439r();
    }

    /* JADX INFO: renamed from: r */
    private void m44439r() {
        this.f28636n = getIntent().getStringExtra("user_id");
        this.f28637o = getIntent().getStringExtra(CreditScoreTaskType.pic);
        this.f28638p = getIntent().getStringExtra("pic_tag");
        if (TextUtils.isEmpty(this.f28636n) || TextUtils.isEmpty(this.f28637o)) {
            m44427h2();
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f28636n);
        if (userM169430Pa == null) {
            m44427h2();
            return;
        }
        this.f28633k.setText(String.format("夸夸%s的照片，开启聊天吧", userM169430Pa.getPronoun()));
        this.f28634l.setHint(String.format("夸夸%s的照片", userM169430Pa.getPronoun()));
        e51.m114743H(this, new Runnable() { // from class: l.zs90
            @Override // java.lang.Runnable
            public final void run() {
                this.f204576a.m44444y2();
            }
        }, 200L);
        qib0.f154691G.m102331L0(this.f28631i, this.f28637o);
        xdl0.m208329E0(this.f28629g, new View.OnClickListener() { // from class: l.at90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71591a.m44445z2(view);
            }
        });
        xdl0.m208329E0(this.f28635m, new View.OnClickListener() { // from class: l.bt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77195a.m44433B2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m44440r2(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                osi0.m165783g(tantanForbidden.message);
                return;
            }
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ C22306c m44441s2(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.f17545c.f19580K1.m33248w3(profileLikeComment.toJson()) : C22306c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: w2 */
    public static void m44443w2(Act act, String str, String str2, String str3) {
        Intent intent = new Intent(act, (Class<?>) ProfileLikeLifePhotoAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra(CreditScoreTaskType.pic, str2);
        intent.putExtra("pic_tag", str3);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(szb0.f167030e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m44444y2() {
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga").autoPlay(true).repeatCount(1).into(this.f28630h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m44445z2(View view) {
        m44427h2();
        zvf0.m220396r("e_close_click", pageId());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: i2 */
    public View mo44428i2() {
        return this.f28627e;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44446v2 = m44446v2(layoutInflater, viewGroup);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f28629g, c3c0.f78808m7);
            this.f28632j.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f28633k.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f28635m.setTextColor(getResources().getColor(a1c0.f67156j));
            this.f28634l.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f28634l.setHintTextColor(getResources().getColor(a1c0.f67155i));
            soe.m185291a(this.f28634l);
        }
        return viewM44446v2;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ys90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199752a.m44434d2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public ViewGroup mo44429k2() {
        return this.f28628f;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public EditText mo44430l2() {
        return this.f28634l;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public ViewGroup mo44431m2() {
        return this.f28626d;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_avatar_compliment_pop";
    }

    /* JADX INFO: renamed from: v2 */
    public View m44446v2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ft90.m123030b(this, layoutInflater, viewGroup);
    }
}
