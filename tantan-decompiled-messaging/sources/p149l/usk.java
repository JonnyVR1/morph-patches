package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p046p1.mobile.putong.live.base.data.BLivePledgeAuctionRight;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b&\u0010\u0018J\u001d\u0010'\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b'\u0010\u0018R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010(¨\u0006+"}, m87232d2 = {"Ll/usk;", "Ll/nnn0;", "D", "Ll/y0v;", "Ll/atk;", "<init>", "()V", "", "init", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "data", "A", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relation", "E", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;)V", "", "k", "()I", "", "Lcom/p1/mobile/putong/live/base/data/BLivePledgeAuctionRight;", "rights", "B", "(Ljava/util/List;)V", Careers.f38732it, "Lv/VDraweeView;", "icon", "Landroid/widget/TextView;", "title", "subTitle", "G", "(Lcom/p1/mobile/putong/live/base/data/BLivePledgeAuctionRight;Lv/VDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;)V", "", "isSpecial", BaseSei.f13932Z, "(Z)V", "relationList", "F", b2s.C_ZONE, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "auctionAsset", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class usk<D extends nnn0> extends y0v<atk<D>> {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public BLiveAuctionAsset auctionAsset;

    /* JADX INFO: renamed from: l.usk$a */
    @Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/usk$a;", "Ll/nnn0;", "D", "Ll/eb2;", "Ll/atk;", "presenter", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relations", "<init>", "(Ll/atk;Ljava/util/List;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", "obj", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "e", "Ll/atk;", "f", "Ljava/util/List;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20501a<D extends nnn0> extends eb2 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final atk<D> presenter;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<BLiveAuctionRelation> relations;

        /* JADX WARN: Multi-variable type inference failed */
        public C20501a(@NotNull atk<D> atkVar, @NotNull List<? extends BLiveAuctionRelation> list) {
            atkVar.getClass();
            list.getClass();
            this.presenter = atkVar;
            this.relations = list;
        }

        @Override // p149l.w660
        public int getCount() {
            int size = this.relations.size() % 8;
            List<BLiveAuctionRelation> list = this.relations;
            return size == 0 ? list.size() / 8 : (list.size() / 8) + 1;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            view.getClass();
            obj.getClass();
            return Intrinsics.m87488d(view, obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(@NotNull ViewGroup container, int position, @NotNull Object obj) {
            container.getClass();
            obj.getClass();
            container.removeView((View) obj);
        }

        @Override // p149l.eb2
        @NotNull
        /* JADX INFO: renamed from: p */
        public Object mo39043p(@NotNull ViewGroup container, int position) {
            container.getClass();
            View viewInflate = View.inflate(container.getContext(), t6c0.f168578x7, null);
            viewInflate.getClass();
            RelationPageView relationPageView = (RelationPageView) viewInflate;
            container.addView(relationPageView);
            int i = position * 8;
            relationPageView.m77859e(this.presenter, this.relations.subList(i, Math.min(i + 8, this.relations.size())), position);
            return relationPageView;
        }
    }

    /* JADX INFO: renamed from: v */
    public static Unit m195214v(usk uskVar, View view) {
        view.getClass();
        uskVar.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m195215w(usk uskVar, View view) {
        view.getClass();
        uskVar.m195224z(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m195216x(usk uskVar, View view) {
        view.getClass();
        ((atk) uskVar.f47706b).m98822U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m195217y(usk uskVar, View view) {
        view.getClass();
        uskVar.m195224z(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public void m195218A(@NotNull BLiveAuctionAsset data) {
        data.getClass();
        this.auctionAsset = data;
        List<BLiveAuctionRelation> list = data.auctionRelations;
        list.getClass();
        m195222F(list);
        List<BLiveAuctionRelation> list2 = data.pledgeAuctionRelations;
        list2.getClass();
        m195220C(list2);
        List<BLivePledgeAuctionRight> list3 = data.pledgeAuctionRights;
        list3.getClass();
        m195219B(list3);
        xdl0.m208344M(this.f195339i, ypv.m215672k().m195914p7());
        m195224z(true);
    }

    /* JADX INFO: renamed from: B */
    public final void m195219B(List<? extends BLivePledgeAuctionRight> rights) {
        if (vwb.m200296J(rights) || rights.size() < 4) {
            return;
        }
        m195223G(rights.get(0), this.f195348r, this.f195349s, this.f195350t);
        m195223G(rights.get(1), this.f195351u, this.f195352v, this.f195353w);
        m195223G(rights.get(2), this.f195354x, this.f195355y, this.f195356z);
        m195223G(rights.get(3), this.f195330A, this.f195331B, this.f195332C);
    }

    /* JADX INFO: renamed from: C */
    public final void m195220C(List<? extends BLiveAuctionRelation> relationList) {
        VPager vPager = this.f195344n;
        P p = this.f47706b;
        p.getClass();
        vPager.setAdapter(new C20501a((atk) p, relationList));
        xdl0.m208344M(this.f195345o, relationList.size() > 8);
        this.f195345o.setViewPager(this.f195344n);
        this.f195344n.m4185d(new C20502b(this));
    }

    /* JADX INFO: renamed from: E */
    public final void m195221E(@NotNull BLiveAuctionRelation relation) {
        relation.getClass();
        String str = relation.desc;
        str.getClass();
        boolean zE0 = StringsKt.m93438e0(str);
        VText vText = this.f195334E;
        if (zE0) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f195334E.setText(relation.desc);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m195222F(List<? extends BLiveAuctionRelation> relationList) {
        VPager vPager = this.f195341k;
        P p = this.f47706b;
        p.getClass();
        vPager.setAdapter(new C20501a((atk) p, relationList));
        xdl0.m208344M(this.f195342l, relationList.size() > 8);
        this.f195342l.setViewPager(this.f195341k);
        this.f195341k.m4185d(new C20503c(this));
    }

    /* JADX INFO: renamed from: G */
    public final void m195223G(BLivePledgeAuctionRight it, VDraweeView icon, TextView title, TextView subTitle) {
        if (title != null) {
            title.setText(it.title);
        }
        if (subTitle != null) {
            subTitle.setText(it.subTitle);
        }
        hxs.m133408u("context_livingAct", icon, it.image, t100.m186890d(32.0f), t100.m186890d(32.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f195333D.setSelected(true);
        VText vText = this.f195333D;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.qsk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return usk.m195216x(this.f156238a, (View) obj);
            }
        });
        VImage vImage = this.f195336f;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.rsk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return usk.m195214v(this.f160873a, (View) obj);
            }
        });
        VText vText2 = this.f195337g;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.ssk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return usk.m195215w(this.f166220a, (View) obj);
            }
        });
        VText vText3 = this.f195338h;
        vText3.getClass();
        cxq.m109105c(vText3, new Function1() { // from class: l.tsk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return usk.m195217y(this.f171941a, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: z */
    public final void m195224z(boolean isSpecial) {
        this.f195337g.setTextColor(kvc0.m147352a(isSpecial ? h1c0.f105386m1 : h1c0.f105395p1));
        this.f195338h.setTextColor(kvc0.m147352a(isSpecial ? h1c0.f105395p1 : h1c0.f105386m1));
        xdl0.m208344M(this.f195341k, !isSpecial);
        xdl0.m208344M(this.f195342l, !isSpecial);
        xdl0.m208344M(this.f195343m, isSpecial);
        this.f195337g.setSelected(!isSpecial);
        this.f195338h.setSelected(isSpecial);
        BLiveAuctionAsset bLiveAuctionAsset = null;
        ((atk) this.f47706b).m98831d4(null);
        BLiveAuctionAsset bLiveAuctionAsset2 = this.auctionAsset;
        if (bLiveAuctionAsset2 == null) {
            Intrinsics.m87502r("auctionAsset");
            bLiveAuctionAsset2 = null;
        }
        if (!vwb.m200296J(bLiveAuctionAsset2.pledgeAuctionRelations) && isSpecial) {
            BLiveAuctionAsset bLiveAuctionAsset3 = this.auctionAsset;
            if (bLiveAuctionAsset3 == null) {
                Intrinsics.m87502r("auctionAsset");
                bLiveAuctionAsset3 = null;
            }
            List<BLiveAuctionRelation> list = bLiveAuctionAsset3.pledgeAuctionRelations;
            list.getClass();
            m195220C(list);
        }
        if (isSpecial) {
            return;
        }
        BLiveAuctionAsset bLiveAuctionAsset4 = this.auctionAsset;
        if (bLiveAuctionAsset4 == null) {
            Intrinsics.m87502r("auctionAsset");
        } else {
            bLiveAuctionAsset = bLiveAuctionAsset4;
        }
        List<BLiveAuctionRelation> list2 = bLiveAuctionAsset.auctionRelations;
        list2.getClass();
        m195222F(list2);
    }

    /* JADX INFO: renamed from: l.usk$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/usk$b", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "offsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20502b implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ usk<D> f177988a;

        public C20502b(usk<D> uskVar) {
            this.f177988a = uskVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            this.f177988a.f195345o.setCurrentItem(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float offset, int offsetPixels) {
        }
    }

    /* JADX INFO: renamed from: l.usk$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/usk$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "offsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20503c implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ usk<D> f177989a;

        public C20503c(usk<D> uskVar) {
            this.f177989a = uskVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            this.f177989a.f195342l.setCurrentItem(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float offset, int offsetPixels) {
        }
    }
}
