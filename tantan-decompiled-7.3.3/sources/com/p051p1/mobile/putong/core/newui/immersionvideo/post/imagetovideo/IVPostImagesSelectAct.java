package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.RankingTopic;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.subjects.C22508b;
import p151v.VButton;
import p151v.VListCell;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.ecj;
import p153l.i4g0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.niw;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.q8m;
import p153l.qa00;
import p153l.uqb0;
import p153l.w30;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectAct extends PutongAct {

    /* JADX INFO: renamed from: i */
    public static C22508b<Boolean> f24866i = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public FrameLayout f24867c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f24868d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f24869e;

    /* JADX INFO: renamed from: f */
    public VButton f24870f;

    /* JADX INFO: renamed from: g */
    public C8224e f24871g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f24872h = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$a */
    public class C8220a extends RecyclerView.AbstractC0578n {
        public C8220a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C0561a0 c0561a0) {
            rect.left = 0;
            rect.right = qa00.m175859d(IVPostImagesSelectMediaView.f24888d);
            rect.top = qa00.m175859d(IVPostImagesSelectMediaView.f24888d);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$b */
    public class C8221b extends C0607k.e {

        /* JADX INFO: renamed from: d */
        public boolean f24874d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.AbstractC0569e0 f24875e;

        public C8221b() {
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: A */
        public void mo3773A(@Nullable RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            super.mo3773A(abstractC0569e0, i);
            int childCount = IVPostImagesSelectAct.this.f24868d.getLayoutManager().getChildCount();
            if (i == 0) {
                IVPostImagesSelectAct.this.m40280z2(this.f24875e, childCount, true);
                this.f24875e = null;
            } else {
                if (this.f24875e == null) {
                    this.f24875e = abstractC0569e0;
                }
                IVPostImagesSelectAct.this.m40280z2(this.f24875e, childCount, false);
            }
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: B */
        public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: k */
        public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
            int itemViewType = abstractC0569e0.getItemViewType();
            C8224e unused = IVPostImagesSelectAct.this.f24871g;
            if (itemViewType != 0) {
                return 0;
            }
            return C0607k.e.m3772t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3796y(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
            int adapterPosition = abstractC0569e0.getAdapterPosition();
            int adapterPosition2 = abstractC0569e1.getAdapterPosition();
            if (adapterPosition2 != IVPostImagesSelectAct.this.f24872h.size() && adapterPosition != IVPostImagesSelectAct.this.f24872h.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= IVPostImagesSelectAct.this.f24872h.size()) {
                            break;
                        }
                        Collections.swap(IVPostImagesSelectAct.this.f24872h, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(IVPostImagesSelectAct.this.f24872h, i3, i3 - 1);
                    }
                }
                this.f24874d = true;
                IVPostImagesSelectAct.this.f24871g.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$c */
    public interface InterfaceC8222c {
        /* JADX INFO: renamed from: a */
        void mo40290a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$d */
    public interface InterfaceC8223d {
        /* JADX INFO: renamed from: a */
        void mo40291a(Media media);

        /* JADX INFO: renamed from: b */
        void mo40292b(Media media);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e */
    public class C8224e extends jic0<Object> {

        /* JADX INFO: renamed from: c */
        public w30 f24877c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e$a */
        public class a implements InterfaceC8223d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f24879a;

            public a(Object obj) {
                this.f24879a = obj;
            }

            @Override // com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8223d
            /* JADX INFO: renamed from: a */
            public void mo40291a(Media media) {
                IVPostImagesSelectAct.this.act.hideInput();
                if (NullChecker.m82486a(C8224e.this.f24877c)) {
                    C8224e.this.f24877c.m204614b();
                }
                Act act = IVPostImagesSelectAct.this.act;
                final Object obj = this.f24879a;
                l51.m152888H(act, new Runnable() { // from class: l.n8m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f140696a.m40302h(obj);
                    }
                }, 400L);
            }

            @Override // com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8223d
            /* JADX INFO: renamed from: b */
            public void mo40292b(Media media) {
                FeedService feedServiceM30932N = CoreModule.m30932N();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                feedServiceM30932N.mo61442Af(iVPostImagesSelectAct.act, media, iVPostImagesSelectAct.f24872h);
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ void m40300f(View view) {
                C8224e.this.f24877c.m204614b();
            }

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ void m40301g(Object obj, VListCell vListCell, VListCell.C22660a c22660a, int i) {
                int iIndexOf = IVPostImagesSelectAct.this.f24872h.indexOf(obj);
                if (iIndexOf >= 0 && iIndexOf < IVPostImagesSelectAct.this.f24872h.size()) {
                    IVPostImagesSelectAct.this.f24872h.remove(iIndexOf);
                    IVPostImagesSelectAct.this.f24871g.notifyDataSetChanged();
                }
                C8224e.this.f24877c.m204614b();
                IVPostImagesSelectAct.this.m40289y2();
            }

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ void m40302h(final Object obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("删除该照片");
                w30.C21001b c21001b = new w30.C21001b(IVPostImagesSelectAct.this.act);
                c21001b.m204656H(R$string.f19138c).m204669U(new View.OnClickListener() { // from class: l.o8m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f145427a.m40300f(view);
                    }
                }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.p8m
                    @Override // p153l.w30.InterfaceC21003d
                    /* JADX INFO: renamed from: a */
                    public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                        this.f151044a.m40301g(obj, vListCell, c22660a, i);
                    }
                });
                C8224e.this.f24877c = c21001b.m204654F();
                C8224e.this.f24877c.m204618f();
            }
        }

        public C8224e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m40296H() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int size = IVPostImagesSelectAct.this.f24872h.size();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                if (i >= size) {
                    Act act = iVPostImagesSelectAct.act;
                    act.startActivityForResult(IVPostMediaPickerAct.m40310Z1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount((9 - IVPostImagesSelectAct.this.f24872h.size()) + arrayList.size()).showPreviewEditBtn(true).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(IVPostImagesSelectAct.this.act.getString(R$string.f19107b)).withFromType(4).withAlreadySelectedMedia(arrayList).build()), PutongAct.REQUEST_CODE_PICKER);
                    IVPostImagesSelectAct.this.act.overridePendingTransition(x7c0.f192710y, x7c0.f192690e);
                    return;
                } else {
                    if (iVPostImagesSelectAct.f24872h.get(i).name != "profile") {
                        arrayList.add(IVPostImagesSelectAct.this.f24872h.get(i));
                    }
                    i++;
                }
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: A */
        public void mo29822A(View view, Object obj, int i, int i2) {
            if (i == 1) {
                ((IVPostImagesSelectIndicatorView) view).m40304b(new InterfaceC8222c() { // from class: l.m8m
                    @Override // com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8222c
                    /* JADX INFO: renamed from: a */
                    public final void mo40290a() {
                        this.f135264a.m40296H();
                    }
                });
            } else {
                ((IVPostImagesSelectMediaView) view).m40307u(IVPostImagesSelectAct.this.f24872h.get(i2), new a(obj));
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            int size = IVPostImagesSelectAct.this.f24872h.size();
            return size < 9 ? size + 1 : size;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
            return i == 1 ? iVPostImagesSelectAct.act.inflater().inflate(kec0.f125910k4, viewGroup, false) : iVPostImagesSelectAct.act.inflater().inflate(kec0.f125961n4, viewGroup, false);
        }

        @Override // p153l.jic0
        public Object getItem(int i) {
            return i == IVPostImagesSelectAct.this.f24872h.size() ? "add image" : IVPostImagesSelectAct.this.f24872h.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            Object item = getItem(i);
            return (NullChecker.m82486a(item) && (item instanceof String)) ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: k2 */
    private void m40274k2() {
        new C0607k(new C8221b()).m3751g(this.f24868d);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m40275l2(Context context, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVPostImagesSelectAct.class);
        intent.putExtra("extra_key_ranking_topic", rankingTopic);
        intent.putExtra("extra_key_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m40276r();
    }

    /* JADX INFO: renamed from: r */
    private void m40276r() {
        this.f24869e.setBackgroundColor(getResources().getColor(c9c0.f80383V1));
        Drawable drawableMutate = getResources().getDrawable(dbc0.f86456P).mutate();
        drawableMutate.setTint(getResources().getColor(c9c0.f80357N));
        this.f24869e.setLeftIconDrawable(drawableMutate);
        this.f24869e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.h8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108251a.m40278u2(view);
            }
        });
        bnl0.m105542Z(this.f24867c, this.f24869e);
        m40284o2();
        bnl0.m105509E0(this.f24870f, new View.OnClickListener() { // from class: l.i8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113358a.m40279v2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m40277s2(Boolean bool) {
        m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m40278u2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m40279v2(View view) {
        i4g0.m138520r("e_choose_photo_to_video_next", pageId());
        if (this.f24872h.size() <= 0) {
            return;
        }
        m40285p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public void m40280z2(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f24868d.getLayoutManager().getChildAt(i2);
            if (NullChecker.m82486a(abstractC0569e0) && childAt == abstractC0569e0.itemView) {
                ((IVPostImagesSelectMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    /* JADX INFO: renamed from: i2 */
    public View m40281i2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q8m.m175823b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m40281i2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.f8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97748a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        duringCreated(f24866i).subscribe(psd0.m173596G(new y20() { // from class: l.g8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102698a.m40277s2((Boolean) obj);
            }
        }));
        this.pageHelper.m152781p(jyb.m147494Y("photo_to_video_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from")));
    }

    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public final void m40285p2() {
        for (int i = 0; i < this.f24872h.size(); i++) {
            if (!this.f24872h.get(i).url.startsWith("file://")) {
                if (!Network.isConnected(this)) {
                    o1j0.m165651y("网络无法连接");
                    return;
                } else {
                    progress("正在准备资源");
                    m40283n2(new x20() { // from class: l.j8m
                        @Override // p153l.x20
                        public final void call() {
                            this.f118789a.m40285p2();
                        }
                    }, true);
                    return;
                }
            }
        }
        progressDismiss();
        startActivity(IVVideoComposerActivity.m40330o2(act(), this.f24872h, getIntent() == null ? null : (RankingTopic) getIntent().getSerializableExtra("extra_key_ranking_topic"), "choose_photo"));
    }

    /* JADX INFO: renamed from: n2 */
    public final void m40283n2(final x20 x20Var, final boolean z) {
        for (int i = 0; i < this.f24872h.size(); i++) {
            String str = this.f24872h.get(i).url;
            if (str.startsWith("http")) {
                final File file = new File(ecj.m120375I().getAbsolutePath() + "/immersionvideo/post", niw.m163315e(str));
                final String str2 = file.getAbsolutePath() + ".tmp";
                boolean zExists = file.exists();
                ArrayList<Media> arrayList = this.f24872h;
                if (zExists) {
                    arrayList.get(i).url = "file://" + file.getAbsolutePath();
                    this.f24872h.get(i).status = MediaLocalStatus.get("raw");
                    m40288w2();
                    if (NullChecker.m82486a(x20Var)) {
                        x20Var.call();
                    }
                } else {
                    final Media media = arrayList.get(i);
                    C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str2).m80824p(1).m80818j(new z20() { // from class: l.k8m
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            this.f124391a.m40286q2(file, media, x20Var, (DownloadTask) obj, (File) obj2);
                        }
                    }).m80814f(new z20() { // from class: l.l8m
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            this.f130499a.m40287r2(str2, z, (DownloadTask) obj, (Throwable) obj2);
                        }
                    }).m80809a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m40284o2() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        List<Media> list = userM116600p9.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + userM116600p9.f56859id)).pictures;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Picture) {
                Media mediaMo225055clone = list.get(i).mo225055clone();
                mediaMo225055clone.name = "profile";
                this.f24872h.add(mediaMo225055clone);
            }
        }
        m40289y2();
        m40288w2();
        m40283n2(null, false);
        m40288w2();
        this.f24871g = new C8224e();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 3);
        this.f24868d.addItemDecoration(new C8220a());
        this.f24868d.setLayoutManager(gridLayoutManager);
        this.f24868d.setAdapter(this.f24871g);
        this.f24868d.setNestedScrollingEnabled(false);
        gridLayoutManager.scrollToPosition(this.f24871g.getItemCount() - 1);
        m40274k2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (jyb.m147479J(list)) {
            return;
        }
        int size = this.f24872h.size();
        while (true) {
            size--;
            ArrayList<Media> arrayList = this.f24872h;
            if (size < 0) {
                arrayList.addAll(list);
                this.f24871g.notifyDataSetChanged();
                m40288w2();
                m40289y2();
                return;
            }
            if (arrayList.get(size).name != "profile") {
                this.f24872h.remove(size);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_choose_photo_to_video";
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
    public final /* synthetic */ void m40286q2(File file, Media media, x20 x20Var, DownloadTask downloadTask, File file2) {
        file2.renameTo(file);
        media.url = "file://" + file.getAbsolutePath();
        media.status = MediaLocalStatus.get("raw");
        m40288w2();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m40287r2(String str, boolean z, DownloadTask downloadTask, Throwable th) {
        oki.m168025m(str);
        if (z) {
            o1j0.m165651y("网络错误，请重试");
            progressDismiss();
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m40288w2() {
        for (int i = 0; i < this.f24872h.size(); i++) {
            String str = this.f24872h.get(i).url;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final void m40289y2() {
        String str;
        this.f24870f.setEnabled(this.f24872h.size() != 0);
        VButton vButton = this.f24870f;
        if (this.f24872h.size() == 0) {
            str = "";
        } else {
            str = "(" + this.f24872h.size() + ")";
        }
        vButton.setText("下一步".concat(str));
    }
}
