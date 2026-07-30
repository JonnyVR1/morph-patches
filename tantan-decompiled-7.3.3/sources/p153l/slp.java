package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SalvagePopUser;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m88121d2 = {"Ll/slp;", "Ll/g1e;", "Landroid/content/Context;", "context", "Landroid/view/View;", "content", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "Companion", "c", "a", Constants.INAPP_DATA_TAG, "e", "b", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class slp extends g1e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static WeakReference<slp> f169410j;

    /* JADX INFO: renamed from: l.slp$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/slp$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/slp$e;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onInstantMatchSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/y20;Ll/y20;)V", "Landroid/view/ViewGroup;", "p", "", "vt", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/slp$e;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/slp$e;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/y20;", "c", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20095a extends RecyclerView.Adapter<C20099e> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onInstantMatchSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C20095a(@NotNull List<? extends SalvagePopUser> list, @Nullable y20<User> y20Var, @Nullable y20<User> y20Var2) {
            list.getClass();
            this.data = list;
            this.onInstantMatchSend = y20Var;
            this.onOpenProfile = y20Var2;
        }

        /* JADX INFO: renamed from: y */
        public static void m186603y(C20095a c20095a, User user, View view) {
            ubp.INSTANCE.m195288w("profile");
            y20<User> y20Var = c20095a.onOpenProfile;
            if (y20Var != null) {
                y20Var.call(user);
            }
            slp.INSTANCE.m186612f();
        }

        /* JADX INFO: renamed from: z */
        public static void m186604z(C20095a c20095a, User user, View view) {
            ubp.INSTANCE.m195288w("instantmatch");
            y20<User> y20Var = c20095a.onInstantMatchSend;
            if (y20Var != null) {
                y20Var.call(user);
            }
            slp.INSTANCE.m186612f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C20099e h, int i) {
            h.getClass();
            ViewGroup.LayoutParams layoutParams = h.getRoot().getLayoutParams();
            layoutParams.height = ubp.INSTANCE.m195279n();
            h.getRoot().setLayoutParams(layoutParams);
            final User user = this.data.get(i).user;
            user.getClass();
            String strMo34565pi = CoreModule.m30933P().m143405a().mo34565pi(user.location.distance);
            h.getMeta().setText(strMo34565pi + "·" + user.age);
            uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.qlp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.C20095a.m186603y(this.f158256a, user, view);
                }
            });
            bnl0.m105509E0(h.getHeart(), new View.OnClickListener() { // from class: l.rlp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.C20095a.m186604z(this.f163776a, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C20099e onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(rec0.f162552g0, p, false);
            viewInflate.getClass();
            return new C20099e(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.slp$c */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/slp$c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/slp$d;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/y20;)V", "Landroid/view/ViewGroup;", "p", "", "vt", "A", "(Landroid/view/ViewGroup;I)Ll/slp$d;", "h", RXScreenCaptureService.KEY_INDEX, "", BaseSei.f14626Z, "(Ll/slp$d;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/y20;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20097c extends RecyclerView.Adapter<C20098d> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C20097c(@NotNull List<? extends SalvagePopUser> list, @Nullable y20<User> y20Var) {
            list.getClass();
            this.data = list;
            this.onOpenProfile = y20Var;
        }

        /* JADX INFO: renamed from: y */
        public static void m186616y(C20097c c20097c, User user, View view) {
            ubp.INSTANCE.m195288w("profile");
            y20<User> y20Var = c20097c.onOpenProfile;
            if (y20Var != null) {
                y20Var.call(user);
            }
            slp.INSTANCE.m186612f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C20098d onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(rec0.f162557h0, p, false);
            viewInflate.getClass();
            return new C20098d(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C20098d h, int i) {
            h.getClass();
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            String strMo34565pi = CoreModule.m30933P().m143405a().mo34565pi(user.location.distance);
            h.getMeta().setText(strMo34565pi + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.age);
            h.getTvName().setText(user.name);
            h.getSuperLikeNum().setText(String.valueOf(salvagePopUser.superLikeCountBy));
            String strMo34513hc = CoreModule.m30933P().m143405a().mo34513hc(h.getTvActive().getContext(), user);
            h.getTvActive().setText(strMo34513hc);
            bnl0.m105524M(h.getActiveRoot(), !TextUtils.isEmpty(strMo34513hc));
            bnl0.m105524M(h.getIvStar(), user.isPicVerificationVerified());
            uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.wlp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.C20097c.m186616y(this.f189716a, user, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.slp$d */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010#\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\u0014\u0010\t\"\u0004\b$\u0010\u0005R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b&\u0010\u0005¨\u0006("}, m88121d2 = {"Ll/slp$d;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", ResourceDirection.f39656v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "e", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "setSuperLikeNum", "(Landroid/widget/TextView;)V", "superLikeNum", Constants.INAPP_DATA_TAG, "setMeta", "meta", "h", "setTvName", "tvName", "g", "setTvActive", "tvActive", "setIvStar", "ivStar", "setActiveRoot", "activeRoot", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20098d extends RecyclerView.AbstractC0569e0 {

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
        public C20098d(@NotNull View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(fdc0.f98347G0);
            viewFindViewById.getClass();
            this.root = viewFindViewById;
            View viewFindViewById2 = view.findViewById(fdc0.f98393c0);
            viewFindViewById2.getClass();
            this.img = (VDraweeView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(fdc0.f98408h0);
            viewFindViewById3.getClass();
            this.ivStar = viewFindViewById3;
            View viewFindViewById4 = view.findViewById(fdc0.f98369R0);
            viewFindViewById4.getClass();
            this.superLikeNum = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(fdc0.f98403f1);
            viewFindViewById5.getClass();
            this.meta = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(fdc0.f98406g1);
            viewFindViewById6.getClass();
            this.tvName = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(fdc0.f98400e1);
            viewFindViewById7.getClass();
            this.tvActive = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(fdc0.f98389b);
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

    /* JADX INFO: renamed from: l.slp$e */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/slp$e;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", ResourceDirection.f39656v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setHeart", "(Landroid/widget/ImageView;)V", Sticker.GESTURE_TYPE_HEART, "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setMeta", "(Landroid/widget/TextView;)V", "meta", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20099e extends RecyclerView.AbstractC0569e0 {

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
        public C20099e(@NotNull View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(fdc0.f98347G0);
            viewFindViewById.getClass();
            this.root = viewFindViewById;
            View viewFindViewById2 = view.findViewById(fdc0.f98393c0);
            viewFindViewById2.getClass();
            this.img = (VDraweeView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(fdc0.f98405g0);
            viewFindViewById3.getClass();
            this.heart = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(fdc0.f98403f1);
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

    public slp(Context context, View view) {
        super(context, false, dgc0.f88286k);
        setCancelable(true);
        m128500x();
        setCanceledOnTouchOutside(true);
        m128502z(view);
    }

    /* JADX INFO: renamed from: l.slp$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J_\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0003R,\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/slp$b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "compact", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "users", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onUnlock", "onInstantMatchSend", "onOpenProfile", "Ll/slp;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;ZLjava/util/List;Ll/y20;Ll/y20;Ll/y20;)Ll/slp;", "Landroid/view/View;", "e", "(Landroid/content/Context;ZLjava/util/List;Ll/y20;Ll/y20;Ll/y20;)Landroid/view/View;", "", "f", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "g", "()Ljava/lang/ref/WeakReference;", "h", "(Ljava/lang/ref/WeakReference;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m186607a(View view) {
            slp.INSTANCE.m186612f();
        }

        /* JADX INFO: renamed from: b */
        public static void m186608b(y20 y20Var, boolean z, List list, View view) {
            ubp.INSTANCE.m195289x();
            if (y20Var != null) {
                y20Var.call(z ? null : ((SalvagePopUser) list.get(0)).user);
            }
            slp.INSTANCE.m186612f();
        }

        /* JADX INFO: renamed from: c */
        public static void m186609c(View view) {
            slp.INSTANCE.m186612f();
        }

        /* JADX INFO: renamed from: e */
        public final View m186611e(Context ctx, final boolean compact, final List<? extends SalvagePopUser> users, final y20<User> onUnlock, y20<User> onInstantMatchSend, y20<User> onOpenProfile) {
            View viewInflate = LayoutInflater.from(ctx).inflate(rec0.f162547f0, (ViewGroup) null, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(fdc0.f98349H0);
            int i = compact ? 2 : 1;
            int i2 = qa00.f156321h;
            recyclerView.setAdapter(compact ? new C20095a(users, onInstantMatchSend, onOpenProfile) : new C20097c(users, onOpenProfile));
            if (compact) {
                recyclerView.setLayoutManager(new GridLayoutManager(ctx, i));
                recyclerView.addItemDecoration(new pdk(i2, i));
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(ctx));
            }
            bnl0.m105537U(recyclerView, compact ? qa00.f156333t : qa00.f156338y);
            TextView textView = (TextView) viewInflate.findViewById(fdc0.f98425n);
            View viewFindViewById = viewInflate.findViewById(fdc0.f98428o);
            View viewFindViewById2 = viewInflate.findViewById(fdc0.f98431p);
            View viewFindViewById3 = viewInflate.findViewById(fdc0.f98422m);
            View viewFindViewById4 = viewInflate.findViewById(fdc0.f98440t);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(fdc0.f98394c1);
            bnl0.m105524M(viewFindViewById2, !compact);
            textView.setText(compact ? R$string.f28096O3 : R$string.f28087N5);
            uqb0.f180374G.m127109I0(vDraweeView, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjBDQ0JDNkU2MjUyOTRDQ0I4NzUzMTlGRTI2RjhBN0NEIiwidyI6MTA1MywiaCI6OTAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIzNjYyNzgyODQ4MjIxLCJwdCI6MjAyNTExMDYxNH0.webp", 700, 600);
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.tlp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.Companion.m186607a(view);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ulp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.Companion.m186608b(onUnlock, compact, users, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.vlp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slp.Companion.m186609c(view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: f */
        public final void m186612f() {
            slp slpVar;
            if (m186613g() != null) {
                Companion companion = slp.INSTANCE;
                WeakReference<slp> weakReferenceM186613g = companion.m186613g();
                if (weakReferenceM186613g != null && (slpVar = weakReferenceM186613g.get()) != null) {
                    slpVar.dismiss();
                }
                companion.m186614h(null);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final WeakReference<slp> m186613g() {
            return slp.f169410j;
        }

        /* JADX INFO: renamed from: h */
        public final void m186614h(@Nullable WeakReference<slp> weakReference) {
            slp.f169410j = weakReference;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final slp m186615i(@NotNull Context ctx, boolean compact, @NotNull List<? extends SalvagePopUser> users, @Nullable y20<User> onUnlock, @Nullable y20<User> onInstantMatchSend, @Nullable y20<User> onOpenProfile) {
            RecyclerView.Adapter adapter;
            ctx.getClass();
            users.getClass();
            slp slpVar = new slp(ctx, m186611e(ctx, compact, users, onUnlock, onInstantMatchSend, onOpenProfile), null);
            m186614h(new WeakReference<>(slpVar));
            slpVar.show();
            RecyclerView recyclerView = (RecyclerView) slpVar.findViewById(fdc0.f98349H0);
            if (compact) {
                ubp ubpVar = ubp.INSTANCE;
                bnl0.m105507D0(C15274a.m88489e((int) (((double) ubpVar.m195279n()) * ubpVar.m195281p()), ubpVar.m195280o()), recyclerView);
            }
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            return slpVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ slp(Context context, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view);
    }
}
