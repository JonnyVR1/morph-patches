package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SalvagePopUser;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m87232d2 = {"Ll/sjp;", "Ll/szd;", "Landroid/content/Context;", "context", "Landroid/view/View;", "content", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "Companion", "c", "a", Constants.INAPP_DATA_TAG, "e", "b", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sjp extends szd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static WeakReference<sjp> f164867j;

    /* JADX INFO: renamed from: l.sjp$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/sjp$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/sjp$e;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onInstantMatchSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/e30;Ll/e30;)V", "Landroid/view/ViewGroup;", "p", "", "vt", b2s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/sjp$e;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/sjp$e;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/e30;", "c", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19959a extends RecyclerView.Adapter<C19963e> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onInstantMatchSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C19959a(@NotNull List<? extends SalvagePopUser> list, @Nullable e30<User> e30Var, @Nullable e30<User> e30Var2) {
            list.getClass();
            this.data = list;
            this.onInstantMatchSend = e30Var;
            this.onOpenProfile = e30Var2;
        }

        /* JADX INFO: renamed from: y */
        public static void m184509y(C19959a c19959a, User user, View view) {
            u9p.INSTANCE.m192620w("profile");
            e30<User> e30Var = c19959a.onOpenProfile;
            if (e30Var != null) {
                e30Var.call(user);
            }
            sjp.INSTANCE.m184518f();
        }

        /* JADX INFO: renamed from: z */
        public static void m184510z(C19959a c19959a, User user, View view) {
            u9p.INSTANCE.m192620w("instantmatch");
            e30<User> e30Var = c19959a.onInstantMatchSend;
            if (e30Var != null) {
                e30Var.call(user);
            }
            sjp.INSTANCE.m184518f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C19963e h, int i) {
            h.getClass();
            ViewGroup.LayoutParams layoutParams = h.getRoot().getLayoutParams();
            layoutParams.height = u9p.INSTANCE.m192611n();
            h.getRoot().setLayoutParams(layoutParams);
            final User user = this.data.get(i).user;
            user.getClass();
            String strMo33562pi = CoreModule.m29935P().m94651a().mo33562pi(user.location.distance);
            h.getMeta().setText(strMo33562pi + "·" + user.age);
            qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.qjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.C19959a.m184509y(this.f154957a, user, view);
                }
            });
            xdl0.m208329E0(h.getHeart(), new View.OnClickListener() { // from class: l.rjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.C19959a.m184510z(this.f159729a, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C19963e onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(m6c0.f131592g0, p, false);
            viewInflate.getClass();
            return new C19963e(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.sjp$c */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/sjp$c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/sjp$d;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/e30;)V", "Landroid/view/ViewGroup;", "p", "", "vt", "A", "(Landroid/view/ViewGroup;I)Ll/sjp$d;", "h", RXScreenCaptureService.KEY_INDEX, "", BaseSei.f13932Z, "(Ll/sjp$d;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/e30;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19961c extends RecyclerView.Adapter<C19962d> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C19961c(@NotNull List<? extends SalvagePopUser> list, @Nullable e30<User> e30Var) {
            list.getClass();
            this.data = list;
            this.onOpenProfile = e30Var;
        }

        /* JADX INFO: renamed from: y */
        public static void m184522y(C19961c c19961c, User user, View view) {
            u9p.INSTANCE.m192620w("profile");
            e30<User> e30Var = c19961c.onOpenProfile;
            if (e30Var != null) {
                e30Var.call(user);
            }
            sjp.INSTANCE.m184518f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C19962d onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(m6c0.f131597h0, p, false);
            viewInflate.getClass();
            return new C19962d(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C19962d h, int i) {
            h.getClass();
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            String strMo33562pi = CoreModule.m29935P().m94651a().mo33562pi(user.location.distance);
            h.getMeta().setText(strMo33562pi + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.age);
            h.getTvName().setText(user.name);
            h.getSuperLikeNum().setText(String.valueOf(salvagePopUser.superLikeCountBy));
            String strMo33510hc = CoreModule.m29935P().m94651a().mo33510hc(h.getTvActive().getContext(), user);
            h.getTvActive().setText(strMo33510hc);
            xdl0.m208344M(h.getActiveRoot(), !TextUtils.isEmpty(strMo33510hc));
            xdl0.m208344M(h.getIvStar(), user.isPicVerificationVerified());
            qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.wjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.C19961c.m184522y(this.f186668a, user, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.sjp$d */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010#\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\u0014\u0010\t\"\u0004\b$\u0010\u0005R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b&\u0010\u0005¨\u0006("}, m87232d2 = {"Ll/sjp$d;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", ResourceDirection.f38808v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "e", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "setSuperLikeNum", "(Landroid/widget/TextView;)V", "superLikeNum", Constants.INAPP_DATA_TAG, "setMeta", "meta", "h", "setTvName", "tvName", "g", "setTvActive", "tvActive", "setIvStar", "ivStar", "setActiveRoot", "activeRoot", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19962d extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public View root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public VDraweeView img;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public TextView superLikeNum;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public TextView meta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public TextView tvName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public TextView tvActive;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public View ivStar;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public View activeRoot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19962d(@NotNull View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(z4c0.f201471G0);
            viewFindViewById.getClass();
            this.root = viewFindViewById;
            View viewFindViewById2 = view.findViewById(z4c0.f201517c0);
            viewFindViewById2.getClass();
            this.img = (VDraweeView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(z4c0.f201532h0);
            viewFindViewById3.getClass();
            this.ivStar = viewFindViewById3;
            View viewFindViewById4 = view.findViewById(z4c0.f201493R0);
            viewFindViewById4.getClass();
            this.superLikeNum = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(z4c0.f201527f1);
            viewFindViewById5.getClass();
            this.meta = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(z4c0.f201530g1);
            viewFindViewById6.getClass();
            this.tvName = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(z4c0.f201524e1);
            viewFindViewById7.getClass();
            this.tvActive = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(z4c0.f201513b);
            viewFindViewById8.getClass();
            this.activeRoot = viewFindViewById8;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getActiveRoot() {
            return this.activeRoot;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final VDraweeView getImg() {
            return this.img;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final View getIvStar() {
            return this.ivStar;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getMeta() {
            return this.meta;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final View getRoot() {
            return this.root;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getSuperLikeNum() {
            return this.superLikeNum;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextView getTvActive() {
            return this.tvActive;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextView getTvName() {
            return this.tvName;
        }
    }

    /* JADX INFO: renamed from: l.sjp$e */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/sjp$e;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", ResourceDirection.f38808v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setHeart", "(Landroid/widget/ImageView;)V", Sticker.GESTURE_TYPE_HEART, "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setMeta", "(Landroid/widget/TextView;)V", "meta", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19963e extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public View root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public VDraweeView img;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public ImageView heart;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public TextView meta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19963e(@NotNull View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(z4c0.f201471G0);
            viewFindViewById.getClass();
            this.root = viewFindViewById;
            View viewFindViewById2 = view.findViewById(z4c0.f201517c0);
            viewFindViewById2.getClass();
            this.img = (VDraweeView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(z4c0.f201529g0);
            viewFindViewById3.getClass();
            this.heart = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(z4c0.f201527f1);
            viewFindViewById4.getClass();
            this.meta = (TextView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageView getHeart() {
            return this.heart;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final VDraweeView getImg() {
            return this.img;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getMeta() {
            return this.meta;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final View getRoot() {
            return this.root;
        }
    }

    public sjp(Context context, View view) {
        super(context, false, y7c0.f196700j);
        setCancelable(true);
        m186758x();
        setCanceledOnTouchOutside(true);
        m186760z(view);
    }

    /* JADX INFO: renamed from: l.sjp$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J_\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0003R,\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/sjp$b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "compact", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "users", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onUnlock", "onInstantMatchSend", "onOpenProfile", "Ll/sjp;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;ZLjava/util/List;Ll/e30;Ll/e30;Ll/e30;)Ll/sjp;", "Landroid/view/View;", "e", "(Landroid/content/Context;ZLjava/util/List;Ll/e30;Ll/e30;Ll/e30;)Landroid/view/View;", "", "f", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "g", "()Ljava/lang/ref/WeakReference;", "h", "(Ljava/lang/ref/WeakReference;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m184513a(View view) {
            sjp.INSTANCE.m184518f();
        }

        /* JADX INFO: renamed from: b */
        public static void m184514b(e30 e30Var, boolean z, List list, View view) {
            u9p.INSTANCE.m192621x();
            if (e30Var != null) {
                e30Var.call(z ? null : ((SalvagePopUser) list.get(0)).user);
            }
            sjp.INSTANCE.m184518f();
        }

        /* JADX INFO: renamed from: c */
        public static void m184515c(View view) {
            sjp.INSTANCE.m184518f();
        }

        /* JADX INFO: renamed from: e */
        public final View m184517e(Context ctx, final boolean compact, final List<? extends SalvagePopUser> users, final e30<User> onUnlock, e30<User> onInstantMatchSend, e30<User> onOpenProfile) {
            View viewInflate = LayoutInflater.from(ctx).inflate(m6c0.f131587f0, (ViewGroup) null, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(z4c0.f201473H0);
            int i = compact ? 2 : 1;
            int i2 = t100.f167259h;
            recyclerView.setAdapter(compact ? new C19959a(users, onInstantMatchSend, onOpenProfile) : new C19961c(users, onOpenProfile));
            if (compact) {
                recyclerView.setLayoutManager(new GridLayoutManager(ctx, i));
                recyclerView.addItemDecoration(new zak(i2, i));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(ctx));
            }
            xdl0.m208357U(recyclerView, compact ? t100.f167271t : t100.f167276y);
            TextView textView = (TextView) viewInflate.findViewById(z4c0.f201549n);
            View viewFindViewById = viewInflate.findViewById(z4c0.f201552o);
            View viewFindViewById2 = viewInflate.findViewById(z4c0.f201555p);
            View viewFindViewById3 = viewInflate.findViewById(z4c0.f201546m);
            View viewFindViewById4 = viewInflate.findViewById(z4c0.f201564t);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(z4c0.f201518c1);
            xdl0.m208344M(viewFindViewById2, !compact);
            textView.setText(compact ? R$string.f27248O3 : R$string.f27239N5);
            qib0.f154691G.m102325I0(vDraweeView, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjBDQ0JDNkU2MjUyOTRDQ0I4NzUzMTlGRTI2RjhBN0NEIiwidyI6MTA1MywiaCI6OTAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIzNjYyNzgyODQ4MjIxLCJwdCI6MjAyNTExMDYxNH0.webp", 700, 600);
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.tjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.Companion.m184513a(view);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ujp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.Companion.m184514b(onUnlock, compact, users, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.vjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sjp.Companion.m184515c(view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: f */
        public final void m184518f() {
            sjp sjpVar;
            if (m184519g() != null) {
                Companion companion = sjp.INSTANCE;
                WeakReference<sjp> weakReferenceM184519g = companion.m184519g();
                if (weakReferenceM184519g != null && (sjpVar = weakReferenceM184519g.get()) != null) {
                    sjpVar.dismiss();
                }
                companion.m184520h(null);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final WeakReference<sjp> m184519g() {
            return sjp.f164867j;
        }

        /* JADX INFO: renamed from: h */
        public final void m184520h(@Nullable WeakReference<sjp> weakReference) {
            sjp.f164867j = weakReference;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final sjp m184521i(@NotNull Context ctx, boolean compact, @NotNull List<? extends SalvagePopUser> users, @Nullable e30<User> onUnlock, @Nullable e30<User> onInstantMatchSend, @Nullable e30<User> onOpenProfile) {
            RecyclerView.Adapter adapter;
            ctx.getClass();
            users.getClass();
            sjp sjpVar = new sjp(ctx, m184517e(ctx, compact, users, onUnlock, onInstantMatchSend, onOpenProfile), null);
            m184520h(new WeakReference<>(sjpVar));
            sjpVar.show();
            RecyclerView recyclerView = (RecyclerView) sjpVar.findViewById(z4c0.f201473H0);
            if (compact) {
                u9p u9pVar = u9p.INSTANCE;
                xdl0.m208327D0(C15167a.m87599e((int) (((double) u9pVar.m192611n()) * u9pVar.m192613p()), u9pVar.m192612o()), recyclerView);
            }
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            return sjpVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ sjp(Context context, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view);
    }
}
