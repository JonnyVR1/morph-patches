package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p051p1.mobile.putong.live.base.data.BLivePledgeAuctionRight;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b&\u0010\u0018J\u001d\u0010'\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b'\u0010\u0018R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010(¨\u0006+"}, m88121d2 = {"Ll/kvk;", "Ll/rwn0;", "D", "Ll/z2v;", "Ll/qvk;", "<init>", "()V", "", "init", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "data", "A", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relation", "E", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;)V", "", "k", "()I", "", "Lcom/p1/mobile/putong/live/base/data/BLivePledgeAuctionRight;", "rights", "B", "(Ljava/util/List;)V", Careers.f39580it, "Lv/VDraweeView;", "icon", "Landroid/widget/TextView;", "title", "subTitle", "G", "(Lcom/p1/mobile/putong/live/base/data/BLivePledgeAuctionRight;Lv/VDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;)V", "", "isSpecial", BaseSei.f14626Z, "(Z)V", "relationList", "F", c4s.C_ZONE, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "auctionAsset", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kvk<D extends rwn0> extends z2v<qvk<D>> {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public BLiveAuctionAsset auctionAsset;

    /* JADX INFO: renamed from: l.kvk$a */
    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/kvk$a;", "Ll/rwn0;", "D", "Ll/lb2;", "Ll/qvk;", "presenter", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "relations", "<init>", "(Ll/qvk;Ljava/util/List;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", "obj", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "e", "Ll/qvk;", "f", "Ljava/util/List;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18278a<D extends rwn0> extends lb2 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final qvk<D> presenter;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<BLiveAuctionRelation> relations;

        /* JADX WARN: Multi-variable type inference failed */
        public C18278a(@NotNull qvk<D> qvkVar, @NotNull List<? extends BLiveAuctionRelation> list) {
            qvkVar.getClass();
            list.getClass();
            this.presenter = qvkVar;
            this.relations = list;
        }

        @Override // p153l.cf60
        public int getCount() {
            int size = this.relations.size() % 8;
            List<BLiveAuctionRelation> list = this.relations;
            return size == 0 ? list.size() / 8 : (list.size() / 8) + 1;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            view.getClass();
            obj.getClass();
            return Intrinsics.m88377d(view, obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(@NotNull ViewGroup container, int position, @NotNull Object obj) {
            container.getClass();
            obj.getClass();
            container.removeView((View) obj);
        }

        @Override // p153l.lb2
        @NotNull
        /* JADX INFO: renamed from: p */
        public Object mo40046p(@NotNull ViewGroup container, int position) {
            container.getClass();
            View viewInflate = View.inflate(container.getContext(), yec0.f199310x7, null);
            viewInflate.getClass();
            RelationPageView relationPageView = (RelationPageView) viewInflate;
            container.addView(relationPageView);
            int i = position * 8;
            relationPageView.m79042e(this.presenter, this.relations.subList(i, Math.min(i + 8, this.relations.size())), position);
            return relationPageView;
        }
    }

    /* JADX INFO: renamed from: v */
    public static Unit m151663v(kvk kvkVar, View view) {
        view.getClass();
        kvkVar.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m151664w(kvk kvkVar, View view) {
        view.getClass();
        kvkVar.m151673z(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m151665x(kvk kvkVar, View view) {
        view.getClass();
        ((qvk) kvkVar.f48554b).m178307U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m151666y(kvk kvkVar, View view) {
        view.getClass();
        kvkVar.m151673z(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public void m151667A(@NotNull BLiveAuctionAsset data) {
        data.getClass();
        this.auctionAsset = data;
        List<BLiveAuctionRelation> list = data.auctionRelations;
        list.getClass();
        m151671F(list);
        List<BLiveAuctionRelation> list2 = data.pledgeAuctionRelations;
        list2.getClass();
        m151669C(list2);
        List<BLivePledgeAuctionRight> list3 = data.pledgeAuctionRights;
        list3.getClass();
        m151668B(list3);
        bnl0.m105524M(this.f202747i, zrv.m221193k().m203701p7());
        m151673z(true);
    }

    /* JADX INFO: renamed from: B */
    public final void m151668B(List<? extends BLivePledgeAuctionRight> rights) {
        if (jyb.m147479J(rights) || rights.size() < 4) {
            return;
        }
        m151672G(rights.get(0), this.f202756r, this.f202757s, this.f202758t);
        m151672G(rights.get(1), this.f202759u, this.f202760v, this.f202761w);
        m151672G(rights.get(2), this.f202762x, this.f202763y, this.f202764z);
        m151672G(rights.get(3), this.f202738A, this.f202739B, this.f202740C);
    }

    /* JADX INFO: renamed from: C */
    public final void m151669C(List<? extends BLiveAuctionRelation> relationList) {
        VPager vPager = this.f202752n;
        P p = this.f48554b;
        p.getClass();
        vPager.setAdapter(new C18278a((qvk) p, relationList));
        bnl0.m105524M(this.f202753o, relationList.size() > 8);
        this.f202753o.setViewPager(this.f202752n);
        this.f202752n.m4187d(new C18279b(this));
    }

    /* JADX INFO: renamed from: E */
    public final void m151670E(@NotNull BLiveAuctionRelation relation) {
        relation.getClass();
        String str = relation.desc;
        str.getClass();
        boolean zE0 = StringsKt.m94329e0(str);
        VText vText = this.f202742E;
        if (zE0) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f202742E.setText(relation.desc);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m151671F(List<? extends BLiveAuctionRelation> relationList) {
        VPager vPager = this.f202749k;
        P p = this.f48554b;
        p.getClass();
        vPager.setAdapter(new C18278a((qvk) p, relationList));
        bnl0.m105524M(this.f202750l, relationList.size() > 8);
        this.f202750l.setViewPager(this.f202749k);
        this.f202749k.m4187d(new C18280c(this));
    }

    /* JADX INFO: renamed from: G */
    public final void m151672G(BLivePledgeAuctionRight it, VDraweeView icon, TextView title, TextView subTitle) {
        if (title != null) {
            title.setText(it.title);
        }
        if (subTitle != null) {
            subTitle.setText(it.subTitle);
        }
        izs.m142870u("context_livingAct", icon, it.image, qa00.m175859d(32.0f), qa00.m175859d(32.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f202741D.setSelected(true);
        VText vText = this.f202741D;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.gvk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kvk.m151665x(this.f106651a, (View) obj);
            }
        });
        VImage vImage = this.f202744f;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.hvk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kvk.m151663v(this.f111766a, (View) obj);
            }
        });
        VText vText2 = this.f202745g;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.ivk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kvk.m151664w(this.f117082a, (View) obj);
            }
        });
        VText vText3 = this.f202746h;
        vText3.getClass();
        czq.m113347c(vText3, new Function1() { // from class: l.jvk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kvk.m151666y(this.f122815a, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: z */
    public final void m151673z(boolean isSpecial) {
        this.f202745g.setTextColor(n3d0.m161277a(isSpecial ? n9c0.f140847m1 : n9c0.f140856p1));
        this.f202746h.setTextColor(n3d0.m161277a(isSpecial ? n9c0.f140856p1 : n9c0.f140847m1));
        bnl0.m105524M(this.f202749k, !isSpecial);
        bnl0.m105524M(this.f202750l, !isSpecial);
        bnl0.m105524M(this.f202751m, isSpecial);
        this.f202745g.setSelected(!isSpecial);
        this.f202746h.setSelected(isSpecial);
        BLiveAuctionAsset bLiveAuctionAsset = null;
        ((qvk) this.f48554b).m178316d4(null);
        BLiveAuctionAsset bLiveAuctionAsset2 = this.auctionAsset;
        if (bLiveAuctionAsset2 == null) {
            Intrinsics.m88391r("auctionAsset");
            bLiveAuctionAsset2 = null;
        }
        if (!jyb.m147479J(bLiveAuctionAsset2.pledgeAuctionRelations) && isSpecial) {
            BLiveAuctionAsset bLiveAuctionAsset3 = this.auctionAsset;
            if (bLiveAuctionAsset3 == null) {
                Intrinsics.m88391r("auctionAsset");
                bLiveAuctionAsset3 = null;
            }
            List<BLiveAuctionRelation> list = bLiveAuctionAsset3.pledgeAuctionRelations;
            list.getClass();
            m151669C(list);
        }
        if (isSpecial) {
            return;
        }
        BLiveAuctionAsset bLiveAuctionAsset4 = this.auctionAsset;
        if (bLiveAuctionAsset4 == null) {
            Intrinsics.m88391r("auctionAsset");
        } else {
            bLiveAuctionAsset = bLiveAuctionAsset4;
        }
        List<BLiveAuctionRelation> list2 = bLiveAuctionAsset.auctionRelations;
        list2.getClass();
        m151671F(list2);
    }

    /* JADX INFO: renamed from: l.kvk$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/kvk$b", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "offsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18279b implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kvk<D> f128969a;

        public C18279b(kvk<D> kvkVar) {
            this.f128969a = kvkVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            this.f128969a.f202753o.setCurrentItem(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float offset, int offsetPixels) {
        }
    }

    /* JADX INFO: renamed from: l.kvk$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/kvk$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "offsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18280c implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kvk<D> f128970a;

        public C18280c(kvk<D> kvkVar) {
            this.f128970a = kvkVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            this.f128970a.f202750l.setCurrentItem(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float offset, int offsetPixels) {
        }
    }
}
