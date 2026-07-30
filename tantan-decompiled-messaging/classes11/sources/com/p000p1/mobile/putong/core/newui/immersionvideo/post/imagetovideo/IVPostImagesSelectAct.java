package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.RankingTopic;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.a6m;
import l.c40;
import l.d30;
import l.dac0;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.j760;
import l.k9j;
import l.lsi0;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.rzb0;
import l.t100;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.subjects.b;
import v.VButton;
import v.VListCell;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVPostImagesSelectAct extends PutongAct {

    /* JADX INFO: renamed from: i */
    public static b<Boolean> f2902i = b.b();

    /* JADX INFO: renamed from: c */
    public FrameLayout f2903c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f2904d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f2905e;

    /* JADX INFO: renamed from: f */
    public VButton f2906f;

    /* JADX INFO: renamed from: g */
    public C0237e f2907g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f2908h = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$a */
    public class C0233a extends RecyclerView.n {
        public C0233a() {
        }

        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.z zVar) {
            rect.left = 0;
            rect.right = t100.d(IVPostImagesSelectMediaView.f2924d);
            rect.top = t100.d(IVPostImagesSelectMediaView.f2924d);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$b */
    public class C0234b extends k.e {

        /* JADX INFO: renamed from: d */
        public boolean f2910d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.d0 f2911e;

        public C0234b() {
        }

        /* JADX INFO: renamed from: A */
        public void m3305A(@Nullable RecyclerView.d0 d0Var, int i) {
            super.A(d0Var, i);
            int childCount = IVPostImagesSelectAct.this.f2904d.getLayoutManager().getChildCount();
            if (i == 0) {
                IVPostImagesSelectAct.this.m3295y2(this.f2911e, childCount, true);
                this.f2911e = null;
            } else {
                if (this.f2911e == null) {
                    this.f2911e = d0Var;
                }
                IVPostImagesSelectAct.this.m3295y2(this.f2911e, childCount, false);
            }
        }

        /* JADX INFO: renamed from: B */
        public void m3306B(RecyclerView.d0 d0Var, int i) {
        }

        /* JADX INFO: renamed from: k */
        public int m3307k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            C0237e unused = IVPostImagesSelectAct.this.f2907g;
            if (itemViewType != 0) {
                return 0;
            }
            return k.e.t(15, 0);
        }

        /* JADX INFO: renamed from: y */
        public boolean m3308y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            int adapterPosition = d0Var.getAdapterPosition();
            int adapterPosition2 = d0Var2.getAdapterPosition();
            if (adapterPosition2 != IVPostImagesSelectAct.this.f2908h.size() && adapterPosition != IVPostImagesSelectAct.this.f2908h.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= IVPostImagesSelectAct.this.f2908h.size()) {
                            break;
                        }
                        Collections.swap(IVPostImagesSelectAct.this.f2908h, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(IVPostImagesSelectAct.this.f2908h, i3, i3 - 1);
                    }
                }
                this.f2910d = true;
                IVPostImagesSelectAct.this.f2907g.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$c */
    public interface InterfaceC0235c {
        /* JADX INFO: renamed from: a */
        void mo3309a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$d */
    public interface InterfaceC0236d {
        /* JADX INFO: renamed from: a */
        void mo3310a(Media media);

        /* JADX INFO: renamed from: b */
        void mo3311b(Media media);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e */
    public class C0237e extends dac0<Object> {

        /* JADX INFO: renamed from: c */
        public c40 f2913c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e$a */
        public class a implements InterfaceC0236d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f2915a;

            public a(Object obj) {
                this.f2915a = obj;
            }

            @Override // com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC0236d
            /* JADX INFO: renamed from: a */
            public void mo3310a(Media media) {
                ((Act) IVPostImagesSelectAct.this).act.hideInput();
                if (NullChecker.a(C0237e.this.f2913c)) {
                    C0237e.this.f2913c.b();
                }
                Act act = ((Act) IVPostImagesSelectAct.this).act;
                final Object obj = this.f2915a;
                e51.H(act, new Runnable() { // from class: l.x5m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22442a.m3324h(obj);
                    }
                }, 400L);
            }

            @Override // com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC0236d
            /* JADX INFO: renamed from: b */
            public void mo3311b(Media media) {
                FeedService feedServiceN = CoreModule.N();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                feedServiceN.Af(((Act) iVPostImagesSelectAct).act, media, iVPostImagesSelectAct.f2908h);
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ void m3322f(View view) {
                C0237e.this.f2913c.b();
            }

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ void m3323g(Object obj, VListCell vListCell, VListCell.a aVar, int i) {
                int iIndexOf = IVPostImagesSelectAct.this.f2908h.indexOf(obj);
                if (iIndexOf >= 0 && iIndexOf < IVPostImagesSelectAct.this.f2908h.size()) {
                    IVPostImagesSelectAct.this.f2908h.remove(iIndexOf);
                    IVPostImagesSelectAct.this.f2907g.notifyDataSetChanged();
                }
                C0237e.this.f2913c.b();
                IVPostImagesSelectAct.this.m3304w2();
            }

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ void m3324h(final Object obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("删除该照片");
                c40.b bVar = new c40.b(((Act) IVPostImagesSelectAct.this).act);
                bVar.H(R.string.c).U(new View.OnClickListener() { // from class: l.y5m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22904a.m3322f(view);
                    }
                }).Q(arrayList).V(new c40.d() { // from class: l.z5m
                    /* JADX INFO: renamed from: a */
                    public final void m25612a(VListCell vListCell, VListCell.a aVar, int i) {
                        this.f23490a.m3323g(obj, vListCell, aVar, i);
                    }
                });
                C0237e.this.f2913c = bVar.F();
                C0237e.this.f2913c.f();
            }
        }

        public C0237e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m3315H() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int size = IVPostImagesSelectAct.this.f2908h.size();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                if (i >= size) {
                    Act act = ((Act) iVPostImagesSelectAct).act;
                    act.startActivityForResult(IVPostMediaPickerAct.m3332Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount((9 - IVPostImagesSelectAct.this.f2908h.size()) + arrayList.size()).showPreviewEditBtn(true).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(((Act) IVPostImagesSelectAct.this).act.getString(R.string.b)).withFromType(4).withAlreadySelectedMedia(arrayList).build()), 786);
                    ((Act) IVPostImagesSelectAct.this).act.overridePendingTransition(rzb0.y, rzb0.e);
                    return;
                } else {
                    if (iVPostImagesSelectAct.f2908h.get(i).name != "profile") {
                        arrayList.add(IVPostImagesSelectAct.this.f2908h.get(i));
                    }
                    i++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: A */
        public void m3316A(View view, Object obj, int i, int i2) {
            if (i == 1) {
                ((IVPostImagesSelectIndicatorView) view).m3326b(new InterfaceC0235c() { // from class: l.w5m
                    @Override // com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC0235c
                    /* JADX INFO: renamed from: a */
                    public final void mo3309a() {
                        this.f21899a.m3315H();
                    }
                });
            } else {
                ((IVPostImagesSelectMediaView) view).m3329u(IVPostImagesSelectAct.this.f2908h.get(i2), new a(obj));
            }
        }

        /* JADX INFO: renamed from: C */
        public int m3317C() {
            int size = IVPostImagesSelectAct.this.f2908h.size();
            return size < 9 ? size + 1 : size;
        }

        /* JADX INFO: renamed from: D */
        public View m3318D(ViewGroup viewGroup, int i) {
            IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
            return i == 1 ? ((Act) iVPostImagesSelectAct).act.inflater().inflate(f6c0.k4, viewGroup, false) : ((Act) iVPostImagesSelectAct).act.inflater().inflate(f6c0.n4, viewGroup, false);
        }

        public Object getItem(int i) {
            return i == IVPostImagesSelectAct.this.f2908h.size() ? "add image" : IVPostImagesSelectAct.this.f2908h.get(i);
        }

        public int getItemViewType(int i) {
            Object item = getItem(i);
            return (NullChecker.a(item) && (item instanceof String)) ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: i2 */
    private void m3289i2() {
        new k(new C0234b()).g(this.f2904d);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m3290k2(Context context, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVPostImagesSelectAct.class);
        intent.putExtra("extra_key_ranking_topic", (Serializable) rankingTopic);
        intent.putExtra("extra_key_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m3291r();
    }

    /* JADX INFO: renamed from: r */
    private void m3291r() {
        this.f2905e.setBackgroundColor(getResources().getColor(w0c0.U1));
        Drawable drawableMutate = getResources().getDrawable(x2c0.O).mutate();
        drawableMutate.setTint(getResources().getColor(w0c0.N));
        this.f2905e.setLeftIconDrawable(drawableMutate);
        this.f2905e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.r5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19641a.m3293s2(view);
            }
        });
        xdl0.Z(new View[]{this.f2903c, this.f2905e});
        m3299n2();
        xdl0.E0(this.f2906f, new View.OnClickListener() { // from class: l.s5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20096a.m3294u2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m3292r2(Boolean bool) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m3293s2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m3294u2(View view) {
        zvf0.r("e_choose_photo_to_video_next", pageId());
        if (this.f2908h.size() <= 0) {
            return;
        }
        m3300o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public void m3295y2(RecyclerView.d0 d0Var, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f2904d.getLayoutManager().getChildAt(i2);
            if (NullChecker.a(d0Var) && childAt == d0Var.itemView) {
                ((IVPostImagesSelectMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    /* JADX INFO: renamed from: h2 */
    public View m3296h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a6m.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3296h2(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.p5m
            public final void call(Object obj) {
                this.f18397a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        duringCreated(f2902i).subscribe(mkd0.G(new e30() { // from class: l.q5m
            public final void call(Object obj) {
                this.f19034a.m3292r2((Boolean) obj);
            }
        }));
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("photo_to_video_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from"))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public final void m3300o2() {
        for (int i = 0; i < this.f2908h.size(); i++) {
            if (!this.f2908h.get(i).url.startsWith("file://")) {
                if (!Network.isConnected(this)) {
                    lsi0.y("网络无法连接");
                    return;
                } else {
                    progress("正在准备资源");
                    m3298m2(new d30() { // from class: l.t5m
                        public final void call() {
                            this.f20563a.m3300o2();
                        }
                    }, true);
                    return;
                }
            }
        }
        progressDismiss();
        startActivity(IVVideoComposerActivity.m3354n2(act(), this.f2908h, getIntent() == null ? null : getIntent().getSerializableExtra("extra_key_ranking_topic"), "choose_photo"));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m3298m2(final d30 d30Var, final boolean z) {
        for (int i = 0; i < this.f2908h.size(); i++) {
            String str = this.f2908h.get(i).url;
            if (str.startsWith("http")) {
                final File file = new File(k9j.I().getAbsolutePath() + "/immersionvideo/post", ogw.e(str));
                final String str2 = file.getAbsolutePath() + ".tmp";
                boolean zExists = file.exists();
                ArrayList<Media> arrayList = this.f2908h;
                if (zExists) {
                    arrayList.get(i).url = "file://" + file.getAbsolutePath();
                    this.f2908h.get(i).status = MediaLocalStatus.get("raw");
                    m3303v2();
                    if (NullChecker.a(d30Var)) {
                        d30Var.call();
                    }
                } else {
                    final Media media = arrayList.get(i);
                    C0513a.m9975u().m9986o(new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9961o(str2).m9962p(1).m9956j(new f30() { // from class: l.u5m
                        public final void call(Object obj, Object obj2) {
                            this.f20997a.m3301p2(file, media, d30Var, (DownloadTask) obj, (File) obj2);
                        }
                    }).m9952f(new f30() { // from class: l.v5m
                        public final void call(Object obj, Object obj2) {
                            this.f21459a.m3302q2(str2, z, (DownloadTask) obj, (Throwable) obj2);
                        }
                    }).m9947a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m3299n2() {
        User userP9 = CoreModule.c.e0.p9();
        List list = userP9.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + ((DbObject) userP9).id)).pictures;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Picture) {
                Media mediaClone = ((Media) list.get(i)).clone();
                mediaClone.name = "profile";
                this.f2908h.add(mediaClone);
            }
        }
        m3304w2();
        m3303v2();
        m3298m2(null, false);
        m3303v2();
        this.f2907g = new C0237e();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((Act) this).act, 3);
        this.f2904d.addItemDecoration(new C0233a());
        this.f2904d.setLayoutManager(gridLayoutManager);
        this.f2904d.setAdapter(this.f2907g);
        this.f2904d.setNestedScrollingEnabled(false);
        gridLayoutManager.scrollToPosition(this.f2907g.getItemCount() - 1);
        m3289i2();
    }

    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (vwb.J(list)) {
            return;
        }
        int size = this.f2908h.size();
        while (true) {
            size--;
            ArrayList<Media> arrayList = this.f2908h;
            if (size < 0) {
                arrayList.addAll(list);
                this.f2907g.notifyDataSetChanged();
                m3303v2();
                m3304w2();
                return;
            }
            if (arrayList.get(size).name != "profile") {
                this.f2908h.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m3301p2(File file, Media media, d30 d30Var, DownloadTask downloadTask, File file2) {
        file2.renameTo(file);
        media.url = "file://" + file.getAbsolutePath();
        media.status = MediaLocalStatus.get("raw");
        m3303v2();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    public String pageId() {
        return "p_choose_photo_to_video";
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

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m3302q2(String str, boolean z, DownloadTask downloadTask, Throwable th) {
        rhi.m(str);
        if (z) {
            lsi0.y("网络错误，请重试");
            progressDismiss();
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m3303v2() {
        for (int i = 0; i < this.f2908h.size(); i++) {
            String str = this.f2908h.get(i).url;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m3304w2() {
        String str;
        this.f2906f.setEnabled(this.f2908h.size() != 0);
        VButton vButton = this.f2906f;
        if (this.f2908h.size() == 0) {
            str = "";
        } else {
            str = "(" + this.f2908h.size() + ")";
        }
        vButton.setText("下一步".concat(str));
    }
}
