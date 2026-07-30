package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

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
import com.p000p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.media.gltransition.TransitionEngine;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.RankingTopic;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Music;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.d30;
import l.e30;
import l.e51;
import l.k9j;
import l.mkd0;
import l.qib0;
import l.rhi;
import l.t6m;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.z4l0;
import rx.subjects.a;
import v.VDraweeView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVVideoComposerActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f2931c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2932d;

    /* JADX INFO: renamed from: e */
    public TextureView f2933e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f2934f;

    /* JADX INFO: renamed from: g */
    public TextView f2935g;

    /* JADX INFO: renamed from: h */
    public ImageView f2936h;

    /* JADX INFO: renamed from: i */
    public TextView f2937i;

    /* JADX INFO: renamed from: j */
    public TextView f2938j;

    /* JADX INFO: renamed from: k */
    public VNavigationBar f2939k;

    /* JADX INFO: renamed from: n */
    public z4l0 f2942n;

    /* JADX INFO: renamed from: o */
    public String f2943o;

    /* JADX INFO: renamed from: q */
    public MusicContent f2945q;

    /* JADX INFO: renamed from: r */
    public ClipDrawable f2946r;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f2940l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public TransitionEngine f2941m = TransitionEngine.create(this);

    /* JADX INFO: renamed from: p */
    public boolean f2944p = false;

    /* JADX INFO: renamed from: s */
    public int f2947s = 1;

    /* JADX INFO: renamed from: t */
    public a f2948t = a.b();

    /* JADX INFO: renamed from: u */
    public TransitionEngine.c f2949u = new C0238a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity$a */
    public class C0238a implements TransitionEngine.c {
        public C0238a() {
        }

        /* JADX INFO: renamed from: a */
        public void m3372a(@NonNull Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public void m3373b() {
        }

        /* JADX INFO: renamed from: c */
        public void m3374c() {
            IVVideoComposerActivity.this.f2948t.onNext(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: d */
        public void m3375d() {
        }

        /* JADX INFO: renamed from: e */
        public void m3376e(final float f) {
            e51.F(IVVideoComposerActivity.this.act(), new Runnable() { // from class: l.s6m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20121a.m3377g(f);
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m3377g(float f) {
            IVVideoComposerActivity.this.m3362D2(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: destroy, reason: merged with bridge method [inline-methods] */
    public void m3356r2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m3355r();
        m3365p2();
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m3354n2(Context context, ArrayList<Media> arrayList, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVVideoComposerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_key_image_list", arrayList);
        bundle.putSerializable("extra_key_ranking_topic", rankingTopic);
        bundle.putString("extra_key_from", str);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m3355r() {
        this.f2939k.setBackgroundColor(getResources().getColor(w0c0.U1));
        this.f2939k.setLeftIconDrawable(getResources().getDrawable(x2c0.d0).mutate());
        this.f2939k.setLeftIconOnClick(new View.OnClickListener() { // from class: l.o6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17857a.m3358u2(view);
            }
        });
        xdl0.Z(new View[]{this.f2939k});
        if (vwb.J(this.f2940l)) {
            return;
        }
        qib0.G.i0(this.f2932d, this.f2940l.get(0).url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m3357s2(c cVar) {
        m3361C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m3358u2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public final Unit m3369y2(Long l2) {
        CoreModule.N().ni((int) (l2.longValue() / 1000)).flatMap(new w9j() { // from class: l.r6m
            public final Object call(Object obj) {
                return CoreModule.N().Ol((Music) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.h6m
            public final void call(Object obj) {
                this.f13891a.m3367v2((MusicContent) obj);
            }
        }, new e30() { // from class: l.i6m
            public final void call(Object obj) {
                this.f14413a.m3368w2((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public final void m3367v2(MusicContent musicContent) {
        this.f2945q = musicContent;
        this.f2941m.exportVideo(this.f2943o, this.f2949u);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m3361C2() {
        if (this.f2944p) {
            return;
        }
        this.f2944p = true;
        this.f2942n = z4l0.Companion.b();
        this.f2943o = k9j.O("i2v.mp4").getAbsolutePath();
        if (vwb.J(this.f2940l)) {
            return;
        }
        this.f2941m.loadImageFromPath(m3370z2(this.f2940l), this.f2942n, new Function1() { // from class: l.n6m
            public final Object invoke(Object obj) {
                return this.f17345a.m3369y2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    public final void m3362D2(float f) {
        if (this.f2946r == null) {
            this.f2946r = (ClipDrawable) this.f2936h.getDrawable();
        }
        int i = (int) (f * 100.0f);
        if (i > this.f2947s) {
            this.f2947s = i;
        }
        this.f2946r.setLevel(this.f2947s * 100);
        this.f2937i.setText(this.f2947s + "%");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3363m2(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("extra_key_image_list");
            if (serializable instanceof ArrayList) {
                this.f2940l.addAll((ArrayList) serializable);
            }
        }
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.g6m
            public final void call(Object obj) {
                this.f13330a.lambda$initSubscription$0((Bundle) obj);
            }
        }, new d30() { // from class: l.j6m
            public final void call() {
                this.f14958a.m3356r2();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.k6m
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.l6m
            public final void call(Object obj) {
                this.f15972a.m3357s2((c) obj);
            }
        }, new e30() { // from class: l.m6m
            public final void call(Object obj) {
                CrashHelper.c(new RuntimeException("startTransitionProcess Error", (Throwable) obj));
            }
        }));
    }

    /* JADX INFO: renamed from: m2 */
    public View m3363m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t6m.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o2 */
    public final Bundle m3364o2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_key_video_path", str);
        bundle.putString("extra_key_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from"));
        MusicContent musicContent = this.f2945q;
        if (musicContent != null) {
            bundle.putParcelable("extra_key_music_content", musicContent);
        }
        return bundle;
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f2941m.cancel();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m3365p2() {
        duringCreated(this.f2948t.asObservable()).subscribe(new e30() { // from class: l.p6m
            public final void call(Object obj) {
                this.f18410a.m3366q2(obj);
            }
        }, new e30() { // from class: l.q6m
            public final void call(Object obj) {
                CrashHelper.c(new RuntimeException("handleVideoExportComplete error", (Throwable) obj));
            }
        });
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = ((Act) this).act;
        act.setNavigationBarColor(act.color(w0c0.b));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m3366q2(Object obj) {
        if (TextUtils.isEmpty(this.f2943o)) {
            return;
        }
        CoreModule.N().oa(act(), m3364o2(this.f2943o), getIntent() == null ? null : (RankingTopic) getIntent().getSerializableExtra("extra_key_ranking_topic"));
        act().finish();
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m3368w2(Throwable th) {
        m3367v2(null);
        CrashHelper.c(new IllegalArgumentException("Get default music Error", th));
    }

    /* JADX INFO: renamed from: z2 */
    public final List<String> m3370z2(List<Media> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rhi.z(it.next().url));
        }
        return arrayList;
    }
}
