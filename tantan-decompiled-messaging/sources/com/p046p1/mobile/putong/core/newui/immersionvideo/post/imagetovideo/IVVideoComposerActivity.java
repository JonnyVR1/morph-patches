package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.media.gltransition.TransitionEngine;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RankingTopic;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.k9j;
import p149l.mkd0;
import p149l.qib0;
import p149l.rhi;
import p149l.t6m;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.z4l0;

/* JADX INFO: loaded from: classes11.dex */
public class IVVideoComposerActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24153c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f24154d;

    /* JADX INFO: renamed from: e */
    public TextureView f24155e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f24156f;

    /* JADX INFO: renamed from: g */
    public TextView f24157g;

    /* JADX INFO: renamed from: h */
    public ImageView f24158h;

    /* JADX INFO: renamed from: i */
    public TextView f24159i;

    /* JADX INFO: renamed from: j */
    public TextView f24160j;

    /* JADX INFO: renamed from: k */
    public VNavigationBar f24161k;

    /* JADX INFO: renamed from: n */
    public z4l0 f24164n;

    /* JADX INFO: renamed from: o */
    public String f24165o;

    /* JADX INFO: renamed from: q */
    public MusicContent f24167q;

    /* JADX INFO: renamed from: r */
    public ClipDrawable f24168r;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f24162l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public TransitionEngine f24163m = TransitionEngine.create(this);

    /* JADX INFO: renamed from: p */
    public boolean f24166p = false;

    /* JADX INFO: renamed from: s */
    public int f24169s = 1;

    /* JADX INFO: renamed from: t */
    public C22392a f24170t = C22392a.m221512b();

    /* JADX INFO: renamed from: u */
    public TransitionEngine.InterfaceC4326c f24171u = new C8074a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity$a */
    public class C8074a implements TransitionEngine.InterfaceC4326c {
        public C8074a() {
        }

        @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4326c
        /* JADX INFO: renamed from: a */
        public void mo20750a(@NonNull Throwable th) {
        }

        @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4326c
        /* JADX INFO: renamed from: b */
        public void mo20751b() {
        }

        @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4326c
        /* JADX INFO: renamed from: c */
        public void mo20752c() {
            IVVideoComposerActivity.this.f24170t.onNext(Unit.INSTANCE);
        }

        @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4326c
        /* JADX INFO: renamed from: d */
        public void mo20753d() {
        }

        @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine.InterfaceC4326c
        /* JADX INFO: renamed from: e */
        public void mo20754e(final float f) {
            e51.m114741F(IVVideoComposerActivity.this.act(), new Runnable() { // from class: l.s6m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162836a.m39345g(f);
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m39345g(float f) {
            IVVideoComposerActivity.this.m39335D2(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: destroy, reason: merged with bridge method [inline-methods] */
    public void m39329r2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m39328r();
        m39338p2();
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m39327n2(Context context, ArrayList<Media> arrayList, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVVideoComposerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_key_image_list", arrayList);
        bundle.putSerializable("extra_key_ranking_topic", rankingTopic);
        bundle.putString("extra_key_from", str);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m39328r() {
        this.f24161k.setBackgroundColor(getResources().getColor(w0c0.f183811U1));
        this.f24161k.setLeftIconDrawable(getResources().getDrawable(x2c0.f190062d0).mutate());
        this.f24161k.setLeftIconOnClick(new View.OnClickListener() { // from class: l.o6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142369a.m39331u2(view);
            }
        });
        xdl0.m208362Z(this.f24161k);
        if (vwb.m200296J(this.f24162l)) {
            return;
        }
        qib0.f154691G.m102363i0(this.f24154d, this.f24162l.get(0).url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m39330s2(C4319c c4319c) {
        m39334C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m39331u2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public final Unit m39342y2(Long l2) {
        CoreModule.m29934N().mo60375ni((int) (l2.longValue() / 1000)).flatMap(new w9j() { // from class: l.r6m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.m29934N().mo60302Ol((Music) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.h6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106095a.m39340v2((MusicContent) obj);
            }
        }, new e30() { // from class: l.i6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111753a.m39341w2((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public final void m39340v2(MusicContent musicContent) {
        this.f24167q = musicContent;
        this.f24163m.exportVideo(this.f24165o, this.f24171u);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m39334C2() {
        if (this.f24166p) {
            return;
        }
        this.f24166p = true;
        this.f24164n = z4l0.INSTANCE.m217104b();
        this.f24165o = k9j.m145083O("i2v.mp4").getAbsolutePath();
        if (vwb.m200296J(this.f24162l)) {
            return;
        }
        this.f24163m.loadImageFromPath(m39343z2(this.f24162l), this.f24164n, new Function1() { // from class: l.n6m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f137427a.m39342y2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    public final void m39335D2(float f) {
        if (this.f24168r == null) {
            this.f24168r = (ClipDrawable) this.f24158h.getDrawable();
        }
        int i = (int) (f * 100.0f);
        if (i > this.f24169s) {
            this.f24169s = i;
        }
        this.f24168r.setLevel(this.f24169s * 100);
        this.f24159i.setText(this.f24169s + "%");
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m39336m2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("extra_key_image_list");
            if (serializable instanceof ArrayList) {
                this.f24162l.addAll((ArrayList) serializable);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.g6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101278a.lambda$initSubscription$0((Bundle) obj);
            }
        }, new d30() { // from class: l.j6m
            @Override // p149l.d30
            public final void call() {
                this.f116486a.m39329r2();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.k6m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.l6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126649a.m39330s2((C4319c) obj);
            }
        }, new e30() { // from class: l.m6m
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c(new RuntimeException("startTransitionProcess Error", (Throwable) obj));
            }
        }));
    }

    /* JADX INFO: renamed from: m2 */
    public View m39336m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t6m.m187385b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o2 */
    public final Bundle m39337o2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_key_video_path", str);
        bundle.putString("extra_key_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from"));
        MusicContent musicContent = this.f24167q;
        if (musicContent != null) {
            bundle.putParcelable("extra_key_music_content", musicContent);
        }
        return bundle;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f24163m.cancel();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m39338p2() {
        duringCreated((C22306c) this.f24170t.asObservable()).subscribe(new e30() { // from class: l.p6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147422a.m39339q2(obj);
            }
        }, new e30() { // from class: l.q6m
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c(new RuntimeException("handleVideoExportComplete error", (Throwable) obj));
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(w0c0.f183831b));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m39339q2(Object obj) {
        if (TextUtils.isEmpty(this.f24165o)) {
            return;
        }
        CoreModule.m29934N().mo60378oa(act(), m39337o2(this.f24165o), getIntent() == null ? null : (RankingTopic) getIntent().getSerializableExtra("extra_key_ranking_topic"));
        act().m47815F2();
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m39341w2(Throwable th) {
        m39340v2(null);
        CrashHelper.m81296c(new IllegalArgumentException("Get default music Error", th));
    }

    /* JADX INFO: renamed from: z2 */
    public final List<String> m39343z2(List<Media> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rhi.m179382z(it.next().url));
        }
        return arrayList;
    }
}
