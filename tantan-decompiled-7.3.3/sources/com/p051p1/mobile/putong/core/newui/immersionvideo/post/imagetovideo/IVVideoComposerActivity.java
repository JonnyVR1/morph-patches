package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.media.gltransition.TransitionEngine;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RankingTopic;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.del0;
import p153l.ecj;
import p153l.j9m;
import p153l.jyb;
import p153l.l51;
import p153l.oki;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IVVideoComposerActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24895c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f24896d;

    /* JADX INFO: renamed from: e */
    public TextureView f24897e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f24898f;

    /* JADX INFO: renamed from: g */
    public TextView f24899g;

    /* JADX INFO: renamed from: h */
    public ImageView f24900h;

    /* JADX INFO: renamed from: i */
    public TextView f24901i;

    /* JADX INFO: renamed from: j */
    public TextView f24902j;

    /* JADX INFO: renamed from: k */
    public VNavigationBar f24903k;

    /* JADX INFO: renamed from: n */
    public del0 f24906n;

    /* JADX INFO: renamed from: o */
    public String f24907o;

    /* JADX INFO: renamed from: q */
    public MusicContent f24909q;

    /* JADX INFO: renamed from: r */
    public ClipDrawable f24910r;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f24904l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public TransitionEngine f24905m = TransitionEngine.create(this);

    /* JADX INFO: renamed from: p */
    public boolean f24908p = false;

    /* JADX INFO: renamed from: s */
    public int f24911s = 1;

    /* JADX INFO: renamed from: t */
    public C22507a f24912t = C22507a.m222758b();

    /* JADX INFO: renamed from: u */
    public TransitionEngine.InterfaceC4477c f24913u = new C8225a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity$a */
    public class C8225a implements TransitionEngine.InterfaceC4477c {
        public C8225a() {
        }

        @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4477c
        /* JADX INFO: renamed from: a */
        public void mo21749a(@NonNull Throwable th) {
        }

        @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4477c
        /* JADX INFO: renamed from: b */
        public void mo21750b() {
        }

        @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4477c
        /* JADX INFO: renamed from: c */
        public void mo21751c() {
            IVVideoComposerActivity.this.f24912t.onNext(Unit.INSTANCE);
        }

        @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4477c
        /* JADX INFO: renamed from: d */
        public void mo21752d() {
        }

        @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4477c
        /* JADX INFO: renamed from: e */
        public void mo21753e(final float f) {
            l51.m152886F(IVVideoComposerActivity.this.act(), new Runnable() { // from class: l.i9m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113489a.m40348g(f);
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m40348g(float f) {
            IVVideoComposerActivity.this.m40339E2(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: destroy, reason: merged with bridge method [inline-methods] */
    public void m40332s2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m40331r();
        m40342q2();
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m40330o2(Context context, ArrayList<Media> arrayList, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVVideoComposerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_key_image_list", arrayList);
        bundle.putSerializable("extra_key_ranking_topic", rankingTopic);
        bundle.putString("extra_key_from", str);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m40331r() {
        this.f24903k.setBackgroundColor(getResources().getColor(c9c0.f80383V1));
        this.f24903k.setLeftIconDrawable(getResources().getDrawable(dbc0.f86940e0).mutate());
        this.f24903k.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92653a.m40334v2(view);
            }
        });
        bnl0.m105542Z(this.f24903k);
        if (jyb.m147479J(this.f24904l)) {
            return;
        }
        uqb0.f180374G.m127146i0(this.f24896d, this.f24904l.get(0).url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m40333u2(C4470c c4470c) {
        m40338D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m40334v2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: A2 */
    public final List<String> m40335A2(List<Media> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(oki.m168038z(it.next().url));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public final Unit m40346z2(Long l2) {
        CoreModule.m30932N().mo61559ni((int) (l2.longValue() / 1000)).flatMap(new qcj() { // from class: l.h9m
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.m30932N().mo61486Ol((Music) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.x8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192855a.m40344w2((MusicContent) obj);
            }
        }, new y20() { // from class: l.y8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198014a.m40345y2((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C2, reason: merged with bridge method [inline-methods] */
    public final void m40344w2(MusicContent musicContent) {
        this.f24909q = musicContent;
        this.f24905m.exportVideo(this.f24907o, this.f24913u);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m40338D2() {
        if (this.f24908p) {
            return;
        }
        this.f24908p = true;
        this.f24906n = del0.INSTANCE.m115433b();
        this.f24907o = ecj.m120381O("i2v.mp4").getAbsolutePath();
        if (jyb.m147479J(this.f24904l)) {
            return;
        }
        this.f24905m.loadImageFromPath(m40335A2(this.f24904l), this.f24906n, new Function1() { // from class: l.d9m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f85794a.m40346z2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E2 */
    public final void m40339E2(float f) {
        if (this.f24910r == null) {
            this.f24910r = (ClipDrawable) this.f24900h.getDrawable();
        }
        int i = (int) (f * 100.0f);
        if (i > this.f24911s) {
            this.f24911s = i;
        }
        this.f24910r.setLevel(this.f24911s * 100);
        this.f24901i.setText(this.f24911s + "%");
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m40340n2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("extra_key_image_list");
            if (serializable instanceof ArrayList) {
                this.f24904l.addAll((ArrayList) serializable);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.w8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187884a.lambda$initSubscription$0((Bundle) obj);
            }
        }, new x20() { // from class: l.z8m
            @Override // p153l.x20
            public final void call() {
                this.f203399a.m40332s2();
            }
        });
        lifecycle().filter(new qcj() { // from class: l.a9m
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.b9m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75595a.m40333u2((C4470c) obj);
            }
        }, new y20() { // from class: l.c9m
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c(new RuntimeException("startTransitionProcess Error", (Throwable) obj));
            }
        }));
    }

    /* JADX INFO: renamed from: n2 */
    public View m40340n2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j9m.m143948b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f24905m.cancel();
    }

    /* JADX INFO: renamed from: p2 */
    public final Bundle m40341p2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_key_video_path", str);
        bundle.putString("extra_key_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from"));
        MusicContent musicContent = this.f24909q;
        if (musicContent != null) {
            bundle.putParcelable("extra_key_music_content", musicContent);
        }
        return bundle;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(c9c0.f80400b));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final void m40342q2() {
        duringCreated((C22421c) this.f24912t.asObservable()).subscribe(new y20() { // from class: l.f9m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97900a.m40343r2(obj);
            }
        }, new y20() { // from class: l.g9m
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c(new RuntimeException("handleVideoExportComplete error", (Throwable) obj));
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m40343r2(Object obj) {
        if (TextUtils.isEmpty(this.f24907o)) {
            return;
        }
        CoreModule.m30932N().mo61562oa(act(), m40341p2(this.f24907o), getIntent() == null ? null : (RankingTopic) getIntent().getSerializableExtra("extra_key_ranking_topic"));
        act().m48999H2();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m40345y2(Throwable th) {
        m40344w2(null);
        CrashHelper.m82479c(new IllegalArgumentException("Get default music Error", th));
    }
}
