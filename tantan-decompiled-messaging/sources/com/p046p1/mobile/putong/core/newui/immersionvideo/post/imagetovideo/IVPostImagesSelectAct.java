package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.RankingTopic;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22393b;
import p147v.VButton;
import p147v.VListCell;
import p147v.navigationbar.VNavigationBar;
import p149l.a6m;
import p149l.c40;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.f6c0;
import p149l.k9j;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ogw;
import p149l.qib0;
import p149l.rhi;
import p149l.rzb0;
import p149l.t100;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostImagesSelectAct extends PutongAct {

    /* JADX INFO: renamed from: i */
    public static C22393b<Boolean> f24124i = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public FrameLayout f24125c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f24126d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f24127e;

    /* JADX INFO: renamed from: f */
    public VButton f24128f;

    /* JADX INFO: renamed from: g */
    public C8073e f24129g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f24130h = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$a */
    public class C8069a extends RecyclerView.AbstractC0576n {
        public C8069a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C0588z c0588z) {
            rect.left = 0;
            rect.right = t100.m186890d(IVPostImagesSelectMediaView.f24146d);
            rect.top = t100.m186890d(IVPostImagesSelectMediaView.f24146d);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$b */
    public class C8070b extends C0605k.e {

        /* JADX INFO: renamed from: d */
        public boolean f24132d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.AbstractC0566d0 f24133e;

        public C8070b() {
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: A */
        public void mo3772A(@Nullable RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            super.mo3772A(abstractC0566d0, i);
            int childCount = IVPostImagesSelectAct.this.f24126d.getLayoutManager().getChildCount();
            if (i == 0) {
                IVPostImagesSelectAct.this.m39277y2(this.f24133e, childCount, true);
                this.f24133e = null;
            } else {
                if (this.f24133e == null) {
                    this.f24133e = abstractC0566d0;
                }
                IVPostImagesSelectAct.this.m39277y2(this.f24133e, childCount, false);
            }
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: B */
        public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: k */
        public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
            int itemViewType = abstractC0566d0.getItemViewType();
            C8073e unused = IVPostImagesSelectAct.this.f24129g;
            if (itemViewType != 0) {
                return 0;
            }
            return C0605k.e.m3771t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3795y(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
            int adapterPosition = abstractC0566d0.getAdapterPosition();
            int adapterPosition2 = abstractC0566d1.getAdapterPosition();
            if (adapterPosition2 != IVPostImagesSelectAct.this.f24130h.size() && adapterPosition != IVPostImagesSelectAct.this.f24130h.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= IVPostImagesSelectAct.this.f24130h.size()) {
                            break;
                        }
                        Collections.swap(IVPostImagesSelectAct.this.f24130h, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(IVPostImagesSelectAct.this.f24130h, i3, i3 - 1);
                    }
                }
                this.f24132d = true;
                IVPostImagesSelectAct.this.f24129g.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$c */
    public interface InterfaceC8071c {
        /* JADX INFO: renamed from: a */
        void mo39287a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$d */
    public interface InterfaceC8072d {
        /* JADX INFO: renamed from: a */
        void mo39288a(Media media);

        /* JADX INFO: renamed from: b */
        void mo39289b(Media media);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e */
    public class C8073e extends dac0<Object> {

        /* JADX INFO: renamed from: c */
        public c40 f24135c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct$e$a */
        public class a implements InterfaceC8072d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f24137a;

            public a(Object obj) {
                this.f24137a = obj;
            }

            @Override // com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8072d
            /* JADX INFO: renamed from: a */
            public void mo39288a(Media media) {
                IVPostImagesSelectAct.this.act.hideInput();
                if (NullChecker.m81303a(C8073e.this.f24135c)) {
                    C8073e.this.f24135c.m105113b();
                }
                Act act = IVPostImagesSelectAct.this.act;
                final Object obj = this.f24137a;
                e51.m114743H(act, new Runnable() { // from class: l.x5m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f191172a.m39299h(obj);
                    }
                }, 400L);
            }

            @Override // com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8072d
            /* JADX INFO: renamed from: b */
            public void mo39289b(Media media) {
                FeedService feedServiceM29934N = CoreModule.m29934N();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                feedServiceM29934N.mo60258Af(iVPostImagesSelectAct.act, media, iVPostImagesSelectAct.f24130h);
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ void m39297f(View view) {
                C8073e.this.f24135c.m105113b();
            }

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ void m39298g(Object obj, VListCell vListCell, VListCell.C22545a c22545a, int i) {
                int iIndexOf = IVPostImagesSelectAct.this.f24130h.indexOf(obj);
                if (iIndexOf >= 0 && iIndexOf < IVPostImagesSelectAct.this.f24130h.size()) {
                    IVPostImagesSelectAct.this.f24130h.remove(iIndexOf);
                    IVPostImagesSelectAct.this.f24129g.notifyDataSetChanged();
                }
                C8073e.this.f24135c.m105113b();
                IVPostImagesSelectAct.this.m39286w2();
            }

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ void m39299h(final Object obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("删除该照片");
                c40.C16057b c16057b = new c40.C16057b(IVPostImagesSelectAct.this.act);
                c16057b.m105155H(R$string.f18408c).m105168U(new View.OnClickListener() { // from class: l.y5m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f196453a.m39297f(view);
                    }
                }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.z5m
                    @Override // p149l.c40.InterfaceC16059d
                    /* JADX INFO: renamed from: a */
                    public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                        this.f201831a.m39298g(obj, vListCell, c22545a, i);
                    }
                });
                C8073e.this.f24135c = c16057b.m105153F();
                C8073e.this.f24135c.m105117f();
            }
        }

        public C8073e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m39293H() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int size = IVPostImagesSelectAct.this.f24130h.size();
                IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
                if (i >= size) {
                    Act act = iVPostImagesSelectAct.act;
                    act.startActivityForResult(IVPostMediaPickerAct.m39307Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount((9 - IVPostImagesSelectAct.this.f24130h.size()) + arrayList.size()).showPreviewEditBtn(true).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(IVPostImagesSelectAct.this.act.getString(R$string.f18377b)).withFromType(4).withAlreadySelectedMedia(arrayList).build()), PutongAct.REQUEST_CODE_PICKER);
                    IVPostImagesSelectAct.this.act.overridePendingTransition(rzb0.f161653y, rzb0.f161633e);
                    return;
                } else {
                    if (iVPostImagesSelectAct.f24130h.get(i).name != "profile") {
                        arrayList.add(IVPostImagesSelectAct.this.f24130h.get(i));
                    }
                    i++;
                }
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: A */
        public void mo28823A(View view, Object obj, int i, int i2) {
            if (i == 1) {
                ((IVPostImagesSelectIndicatorView) view).m39301b(new InterfaceC8071c() { // from class: l.w5m
                    @Override // com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct.InterfaceC8071c
                    /* JADX INFO: renamed from: a */
                    public final void mo39287a() {
                        this.f184715a.m39293H();
                    }
                });
            } else {
                ((IVPostImagesSelectMediaView) view).m39304u(IVPostImagesSelectAct.this.f24130h.get(i2), new a(obj));
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            int size = IVPostImagesSelectAct.this.f24130h.size();
            return size < 9 ? size + 1 : size;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            IVPostImagesSelectAct iVPostImagesSelectAct = IVPostImagesSelectAct.this;
            return i == 1 ? iVPostImagesSelectAct.act.inflater().inflate(f6c0.f95856k4, viewGroup, false) : iVPostImagesSelectAct.act.inflater().inflate(f6c0.f95907n4, viewGroup, false);
        }

        @Override // p149l.dac0
        public Object getItem(int i) {
            return i == IVPostImagesSelectAct.this.f24130h.size() ? "add image" : IVPostImagesSelectAct.this.f24130h.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            Object item = getItem(i);
            return (NullChecker.m81303a(item) && (item instanceof String)) ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: i2 */
    private void m39271i2() {
        new C0605k(new C8070b()).m3750g(this.f24126d);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m39272k2(Context context, RankingTopic rankingTopic, String str) {
        Intent intent = new Intent(context, (Class<?>) IVPostImagesSelectAct.class);
        intent.putExtra("extra_key_ranking_topic", rankingTopic);
        intent.putExtra("extra_key_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m39273r();
    }

    /* JADX INFO: renamed from: r */
    private void m39273r() {
        this.f24127e.setBackgroundColor(getResources().getColor(w0c0.f183811U1));
        Drawable drawableMutate = getResources().getDrawable(x2c0.f189593O).mutate();
        drawableMutate.setTint(getResources().getColor(w0c0.f183788N));
        this.f24127e.setLeftIconDrawable(drawableMutate);
        this.f24127e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.r5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157839a.m39275s2(view);
            }
        });
        xdl0.m208362Z(this.f24125c, this.f24127e);
        m39281n2();
        xdl0.m208329E0(this.f24128f, new View.OnClickListener() { // from class: l.s5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162574a.m39276u2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m39274r2(Boolean bool) {
        m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m39275s2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m39276u2(View view) {
        zvf0.m220396r("e_choose_photo_to_video_next", pageId());
        if (this.f24130h.size() <= 0) {
            return;
        }
        m39282o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public void m39277y2(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f24126d.getLayoutManager().getChildAt(i2);
            if (NullChecker.m81303a(abstractC0566d0) && childAt == abstractC0566d0.itemView) {
                ((IVPostImagesSelectMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    /* JADX INFO: renamed from: h2 */
    public View m39278h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a6m.m95150b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m39278h2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.p5m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147310a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        duringCreated(f24124i).subscribe(mkd0.m154955G(new e30() { // from class: l.q5m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152785a.m39274r2((Boolean) obj);
            }
        }));
        this.pageHelper.m109040p(vwb.m200311Y("photo_to_video_from", getIntent() == null ? "" : getIntent().getStringExtra("extra_key_from")));
    }

    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public final void m39282o2() {
        for (int i = 0; i < this.f24130h.size(); i++) {
            if (!this.f24130h.get(i).url.startsWith("file://")) {
                if (!Network.isConnected(this)) {
                    lsi0.m151595y("网络无法连接");
                    return;
                } else {
                    progress("正在准备资源");
                    m39280m2(new d30() { // from class: l.t5m
                        @Override // p149l.d30
                        public final void call() {
                            this.f167839a.m39282o2();
                        }
                    }, true);
                    return;
                }
            }
        }
        progressDismiss();
        startActivity(IVVideoComposerActivity.m39327n2(act(), this.f24130h, getIntent() == null ? null : (RankingTopic) getIntent().getSerializableExtra("extra_key_ranking_topic"), "choose_photo"));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m39280m2(final d30 d30Var, final boolean z) {
        for (int i = 0; i < this.f24130h.size(); i++) {
            String str = this.f24130h.get(i).url;
            if (str.startsWith("http")) {
                final File file = new File(k9j.m145077I().getAbsolutePath() + "/immersionvideo/post", ogw.m164284e(str));
                final String str2 = file.getAbsolutePath() + ".tmp";
                boolean zExists = file.exists();
                ArrayList<Media> arrayList = this.f24130h;
                if (zExists) {
                    arrayList.get(i).url = "file://" + file.getAbsolutePath();
                    this.f24130h.get(i).status = MediaLocalStatus.get("raw");
                    m39285v2();
                    if (NullChecker.m81303a(d30Var)) {
                        d30Var.call();
                    }
                } else {
                    final Media media = arrayList.get(i);
                    C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str2).m79641p(1).m79635j(new f30() { // from class: l.u5m
                        @Override // p149l.f30
                        public final void call(Object obj, Object obj2) {
                            this.f174733a.m39283p2(file, media, d30Var, (DownloadTask) obj, (File) obj2);
                        }
                    }).m79631f(new f30() { // from class: l.v5m
                        @Override // p149l.f30
                        public final void call(Object obj, Object obj2) {
                            this.f180095a.m39284q2(str2, z, (DownloadTask) obj, (Throwable) obj2);
                        }
                    }).m79626a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m39281n2() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        List<Media> list = userM169527p9.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + userM169527p9.f56011id)).pictures;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Picture) {
                Media mediaMo223809clone = list.get(i).mo223809clone();
                mediaMo223809clone.name = "profile";
                this.f24130h.add(mediaMo223809clone);
            }
        }
        m39286w2();
        m39285v2();
        m39280m2(null, false);
        m39285v2();
        this.f24129g = new C8073e();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 3);
        this.f24126d.addItemDecoration(new C8069a());
        this.f24126d.setLayoutManager(gridLayoutManager);
        this.f24126d.setAdapter(this.f24129g);
        this.f24126d.setNestedScrollingEnabled(false);
        gridLayoutManager.scrollToPosition(this.f24129g.getItemCount() - 1);
        m39271i2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (vwb.m200296J(list)) {
            return;
        }
        int size = this.f24130h.size();
        while (true) {
            size--;
            ArrayList<Media> arrayList = this.f24130h;
            if (size < 0) {
                arrayList.addAll(list);
                this.f24129g.notifyDataSetChanged();
                m39285v2();
                m39286w2();
                return;
            }
            if (arrayList.get(size).name != "profile") {
                this.f24130h.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m39283p2(File file, Media media, d30 d30Var, DownloadTask downloadTask, File file2) {
        file2.renameTo(file);
        media.url = "file://" + file.getAbsolutePath();
        media.status = MediaLocalStatus.get("raw");
        m39285v2();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_choose_photo_to_video";
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
    public final /* synthetic */ void m39284q2(String str, boolean z, DownloadTask downloadTask, Throwable th) {
        rhi.m179369m(str);
        if (z) {
            lsi0.m151595y("网络错误，请重试");
            progressDismiss();
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m39285v2() {
        for (int i = 0; i < this.f24130h.size(); i++) {
            String str = this.f24130h.get(i).url;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m39286w2() {
        String str;
        this.f24128f.setEnabled(this.f24130h.size() != 0);
        VButton vButton = this.f24128f;
        if (this.f24130h.size() == 0) {
            str = "";
        } else {
            str = "(" + this.f24130h.size() + ")";
        }
        vButton.setText("下一步".concat(str));
    }
}
