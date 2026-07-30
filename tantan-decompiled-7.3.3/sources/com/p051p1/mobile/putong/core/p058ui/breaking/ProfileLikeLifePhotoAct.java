package com.p051p1.mobile.putong.core.p058ui.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeLifePhotoAct;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.connect.common.Constants;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.j1a0;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.wpe;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileLikeLifePhotoAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f29474d;

    /* JADX INFO: renamed from: e */
    public View f29475e;

    /* JADX INFO: renamed from: f */
    public VLinear f29476f;

    /* JADX INFO: renamed from: g */
    public VImage f29477g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f29478h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f29479i;

    /* JADX INFO: renamed from: j */
    public VText f29480j;

    /* JADX INFO: renamed from: k */
    public VText f29481k;

    /* JADX INFO: renamed from: l */
    public VEditText f29482l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f29483m;

    /* JADX INFO: renamed from: n */
    public String f29484n;

    /* JADX INFO: renamed from: o */
    public String f29485o;

    /* JADX INFO: renamed from: p */
    public String f29486p;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m45615A2(View view) {
        m45610i2();
        i4g0.m138520r("e_close_click", pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m45616B2(Boolean bool) {
        if (bool.booleanValue()) {
            setResult(-1);
            m45610i2();
            i4g0.m138523u("e_send_compliment", pageId(), pf60.m172085a("to_uid", this.f29484n));
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m45617C2(View view) {
        String strTrim = this.f29482l.getText().toString().trim();
        final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        profileLikeCommentNew_.userId = this.f29484n;
        profileLikeCommentNew_.module = ProfileLikeType.life_pic;
        profileLikeCommentNew_.category = ProfileLikeType.life_pic;
        profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
        profileLikeCommentNew_.comment = TextUtils.isEmpty(strTrim) ? "赞了你的照片" : strTrim;
        ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
        profileLikeSnapshotNew_.picture = this.f29485o;
        profileLikeSnapshotNew_.title = "生活照";
        NewTags newTagsMo34694Gh = gta.m132210e().m132214d().mo34694Gh(this.f29486p);
        profileLikeSnapshotNew_.desc = newTagsMo34694Gh == null ? "" : newTagsMo34694Gh.name;
        profileLikeSnapshotNew_.hasComment = !TextUtils.isEmpty(strTrim);
        profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
        duringCreated((C22421c) CoreModule.f18264c.f20437w2.m221453b3(this.act, profileLikeCommentNew_.comment, DetectCategoryType.get(DetectCategoryType.profile_comment)).flatMap(new qcj() { // from class: l.g1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLikeLifePhotoAct.m45625u2(profileLikeCommentNew_, (Boolean) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.h1a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107424a.m45616B2((Boolean) obj);
            }
        }, new y20() { // from class: l.i1a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileLikeLifePhotoAct.m45624s2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m45618e2(Bundle bundle) {
        m45622r();
    }

    /* JADX INFO: renamed from: r */
    private void m45622r() {
        this.f29484n = getIntent().getStringExtra("user_id");
        this.f29485o = getIntent().getStringExtra(CreditScoreTaskType.pic);
        this.f29486p = getIntent().getStringExtra("pic_tag");
        if (TextUtils.isEmpty(this.f29484n) || TextUtils.isEmpty(this.f29485o)) {
            m45610i2();
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f29484n);
        if (userM116503Pa == null) {
            m45610i2();
            return;
        }
        this.f29481k.setText(String.format("夸夸%s的照片，开启聊天吧", userM116503Pa.getPronoun()));
        this.f29482l.setHint(String.format("夸夸%s的照片", userM116503Pa.getPronoun()));
        l51.m152888H(this, new Runnable() { // from class: l.d1a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f84660a.m45628z2();
            }
        }, 200L);
        uqb0.f180374G.m127115L0(this.f29479i, this.f29485o);
        bnl0.m105509E0(this.f29477g, new View.OnClickListener() { // from class: l.e1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91576a.m45615A2(view);
            }
        });
        bnl0.m105509E0(this.f29483m, new View.OnClickListener() { // from class: l.f1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96777a.m45617C2(view);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m45624s2(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                r1j0.m179420g(tantanForbidden.message);
                return;
            }
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ C22421c m45625u2(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.f18264c.f20322K1.m34251w3(profileLikeComment.toJson()) : C22421c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: y2 */
    public static void m45627y2(Act act, String str, String str2, String str3) {
        Intent intent = new Intent(act, (Class<?>) ProfileLikeLifePhotoAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra(CreditScoreTaskType.pic, str2);
        intent.putExtra("pic_tag", str3);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(y7c0.f197767e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m45628z2() {
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga").autoPlay(true).repeatCount(1).into(this.f29478h);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM45629w2 = m45629w2(layoutInflater, viewGroup);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f29477g, ibc0.f114083m7);
            this.f29480j.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f29481k.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f29483m.setTextColor(getResources().getColor(g9c0.f102820j));
            this.f29482l.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f29482l.setHintTextColor(getResources().getColor(g9c0.f102819i));
            wpe.m207454a(this.f29482l);
        }
        return viewM45629w2;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.c1a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79382a.m45618e2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public View mo45611k2() {
        return this.f29475e;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public ViewGroup mo45612l2() {
        return this.f29476f;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public EditText mo45613m2() {
        return this.f29482l;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: n2 */
    public ViewGroup mo45614n2() {
        return this.f29474d;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_avatar_compliment_pop";
    }

    /* JADX INFO: renamed from: w2 */
    public View m45629w2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j1a0.m143111b(this, layoutInflater, viewGroup);
    }
}
