package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SalvagePopUser;
import com.p046p1.mobile.putong.core.data.SalvagePopUserType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m87232d2 = {"Ll/f9p;", "Ll/szd;", "Landroid/content/Context;", "context", "Landroid/view/View;", "content", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "Companion", "c", "a", Constants.INAPP_DATA_TAG, "e", "b", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f9p extends szd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static WeakReference<f9p> f96500j;

    /* JADX INFO: renamed from: l.f9p$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/f9p$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/f9p$e;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;)V", "Landroid/view/ViewGroup;", "p", "", "vt", b2s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/f9p$e;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/f9p$e;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/e30;", "c", Constants.INAPP_DATA_TAG, "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16778a extends RecyclerView.Adapter<C16782e> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onSuperLikeSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onLikeSend;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C16778a(@NotNull List<? extends SalvagePopUser> list, @Nullable e30<User> e30Var, @Nullable e30<User> e30Var2, @Nullable e30<User> e30Var3) {
            list.getClass();
            this.data = list;
            this.onSuperLikeSend = e30Var;
            this.onLikeSend = e30Var2;
            this.onOpenProfile = e30Var3;
        }

        /* JADX INFO: renamed from: y */
        public static void m120094y(Ref.BooleanRef booleanRef, C16778a c16778a, User user, View view) {
            u9p.INSTANCE.m192620w(booleanRef.element ? "superlike" : "like");
            e30<User> e30Var = booleanRef.element ? c16778a.onSuperLikeSend : c16778a.onLikeSend;
            if (e30Var != null) {
                e30Var.call(user);
            }
            f9p.INSTANCE.m120103f();
        }

        /* JADX INFO: renamed from: z */
        public static void m120095z(C16778a c16778a, User user, View view) {
            u9p.INSTANCE.m192620w("profile");
            e30<User> e30Var = c16778a.onOpenProfile;
            if (e30Var != null) {
                e30Var.call(user);
            }
            f9p.INSTANCE.m120103f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C16782e h, int i) {
            h.getClass();
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (TEnum.equals(salvagePopUser.salvagePopUserType, SalvagePopUserType.rightSwipe)) {
                booleanRef.element = true;
                qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
                if (IntlCountryCodeController.m28126v()) {
                    h.getHeart().setBackgroundResource(d3c0.f83573G1);
                } else {
                    h.getHeart().setBackgroundResource(d3c0.f83545E1);
                }
            } else {
                booleanRef.element = false;
                if (xma.m210077h4()) {
                    qib0.f154691G.m102336O(h.getImg(), user.m60124fp().profile480().formatted(), 4, 35);
                } else {
                    qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
                }
                if (IntlCountryCodeController.m28126v()) {
                    h.getHeart().setBackgroundResource(d3c0.f83531D1);
                } else {
                    h.getHeart().setBackgroundResource(d3c0.f83517C1);
                }
            }
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.d9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.C16778a.m120095z(this.f85137a, user, view);
                }
            });
            h.getHeart().setOnClickListener(new View.OnClickListener() { // from class: l.e9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.C16778a.m120094y(booleanRef, this, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C16782e onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(m6c0.f131485H, p, false);
            viewInflate.getClass();
            return new C16782e(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.f9p$c */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/f9p$c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/f9p$d;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;)V", "Landroid/view/ViewGroup;", "p", "", "vt", b2s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/f9p$d;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/f9p$d;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/e30;", "c", Constants.INAPP_DATA_TAG, "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16780c extends RecyclerView.Adapter<C16781d> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onSuperLikeSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onLikeSend;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final e30<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C16780c(@NotNull List<? extends SalvagePopUser> list, @Nullable e30<User> e30Var, @Nullable e30<User> e30Var2, @Nullable e30<User> e30Var3) {
            list.getClass();
            this.data = list;
            this.onSuperLikeSend = e30Var;
            this.onLikeSend = e30Var2;
            this.onOpenProfile = e30Var3;
        }

        /* JADX INFO: renamed from: y */
        public static void m120107y(Ref.BooleanRef booleanRef, C16780c c16780c, User user, View view) {
            u9p.INSTANCE.m192620w(booleanRef.element ? "superlike" : "like");
            e30<User> e30Var = booleanRef.element ? c16780c.onSuperLikeSend : c16780c.onLikeSend;
            if (e30Var != null) {
                e30Var.call(user);
            }
            f9p.INSTANCE.m120103f();
        }

        /* JADX INFO: renamed from: z */
        public static void m120108z(C16780c c16780c, User user, View view) {
            u9p.INSTANCE.m192620w("profile");
            e30<User> e30Var = c16780c.onOpenProfile;
            if (e30Var != null) {
                e30Var.call(user);
            }
            f9p.INSTANCE.m120103f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C16781d h, int i) {
            h.getClass();
            ViewGroup.LayoutParams layoutParams = h.getRoot().getLayoutParams();
            layoutParams.height = u9p.INSTANCE.m192611n();
            h.getRoot().setLayoutParams(layoutParams);
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String strMo33562pi = CoreModule.m29935P().m94651a().mo33562pi(user.location.distance);
            h.getMeta().setText(strMo33562pi + "·" + user.age);
            if (TEnum.equals(salvagePopUser.salvagePopUserType, SalvagePopUserType.rightSwipe)) {
                booleanRef.element = true;
                qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
                if (IntlCountryCodeController.m28126v()) {
                    h.getStar().setBackgroundResource(d3c0.f83587H1);
                } else {
                    h.getStar().setBackgroundResource(d3c0.f83559F1);
                }
            } else {
                booleanRef.element = false;
                if (xma.m210077h4()) {
                    qib0.f154691G.m102336O(h.getImg(), user.m60124fp().profile480().formatted(), 4, 35);
                } else {
                    qib0.f154691G.m102331L0(h.getImg(), user.m60124fp().profile480().formatted());
                }
                if (IntlCountryCodeController.m28126v()) {
                    h.getStar().setBackgroundResource(d3c0.f83531D1);
                } else {
                    h.getStar().setBackgroundResource(d3c0.f83517C1);
                }
            }
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.j9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.C16780c.m120108z(this.f116945a, user, view);
                }
            });
            h.getStar().setOnClickListener(new View.OnClickListener() { // from class: l.k9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.C16780c.m120107y(booleanRef, this, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C16781d onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(m6c0.f131489I, p, false);
            viewInflate.getClass();
            return new C16781d(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.f9p$d */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\r\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/f9p$d;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", ResourceDirection.f38808v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "()Landroid/widget/ImageView;", "setStar", "(Landroid/widget/ImageView;)V", "star", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setMeta", "(Landroid/widget/TextView;)V", "meta", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16781d extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public View root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public VDraweeView img;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public ImageView star;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public TextView meta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16781d(@NotNull View view) {
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
            this.star = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(z4c0.f201527f1);
            viewFindViewById4.getClass();
            this.meta = (TextView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final VDraweeView getImg() {
            return this.img;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getMeta() {
            return this.meta;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final View getRoot() {
            return this.root;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ImageView getStar() {
            return this.star;
        }
    }

    /* JADX INFO: renamed from: l.f9p$e */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/f9p$e;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", ResourceDirection.f38808v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setHeart", "(Landroid/widget/ImageView;)V", Sticker.GESTURE_TYPE_HEART, "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16782e extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public View root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public VDraweeView img;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public ImageView heart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16782e(@NotNull View view) {
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
        public final View getRoot() {
            return this.root;
        }
    }

    public f9p(Context context, View view) {
        super(context, false, y7c0.f196700j);
        setCancelable(true);
        m186758x();
        setCanceledOnTouchOutside(true);
        m186760z(view);
    }

    /* JADX INFO: renamed from: l.f9p$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R,\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/f9p$b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "compact", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "users", "Ljava/lang/Runnable;", "onUnlock", "Ll/e30;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "Ll/f9p;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;ZLjava/util/List;Ljava/lang/Runnable;Ll/e30;Ll/e30;Ll/e30;)Ll/f9p;", "Landroid/view/View;", "e", "(Landroid/content/Context;ZLjava/util/List;Ljava/lang/Runnable;Ll/e30;Ll/e30;Ll/e30;)Landroid/view/View;", "", "f", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "g", "()Ljava/lang/ref/WeakReference;", "h", "(Ljava/lang/ref/WeakReference;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m120098a(View view) {
            Companion companion = f9p.INSTANCE;
            WeakReference<f9p> weakReferenceM120104g = companion.m120104g();
            weakReferenceM120104g.getClass();
            if (weakReferenceM120104g.get() != null) {
                WeakReference<f9p> weakReferenceM120104g2 = companion.m120104g();
                weakReferenceM120104g2.getClass();
                f9p f9pVar = weakReferenceM120104g2.get();
                f9pVar.getClass();
                f9pVar.dismiss();
                companion.m120105h(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m120099b(View view) {
            f9p.INSTANCE.m120103f();
        }

        /* JADX INFO: renamed from: c */
        public static void m120100c(Runnable runnable, View view) {
            u9p.INSTANCE.m192621x();
            if (runnable != null) {
                runnable.run();
            }
            f9p.INSTANCE.m120103f();
        }

        /* JADX INFO: renamed from: e */
        public final View m120102e(Context ctx, boolean compact, List<? extends SalvagePopUser> users, final Runnable onUnlock, e30<User> onSuperLikeSend, e30<User> onLikeSend, e30<User> onOpenProfile) {
            View viewInflate = LayoutInflater.from(ctx).inflate(m6c0.f131481G, (ViewGroup) null, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(z4c0.f201473H0);
            int i = compact ? 3 : 2;
            int i2 = compact ? t100.f167260i : t100.f167259h;
            recyclerView.setLayoutManager(new GridLayoutManager(ctx, i));
            recyclerView.setAdapter(compact ? new C16778a(users, onSuperLikeSend, onLikeSend, onOpenProfile) : new C16780c(users, onSuperLikeSend, onLikeSend, onOpenProfile));
            recyclerView.addItemDecoration(new zak(i2, i));
            if (compact) {
                xdl0.m208360X(recyclerView, t100.f167271t);
            }
            View viewFindViewById = viewInflate.findViewById(z4c0.f201471G0);
            if (!compact) {
                int i3 = t100.f167261j;
                xdl0.m208370d0(viewFindViewById, i3);
                xdl0.m208372e0(viewFindViewById, i3);
            }
            View viewFindViewById2 = viewInflate.findViewById(z4c0.f201549n);
            View viewFindViewById3 = viewInflate.findViewById(z4c0.f201546m);
            View viewFindViewById4 = viewInflate.findViewById(z4c0.f201564t);
            qib0.f154691G.m102325I0((VDraweeView) viewInflate.findViewById(z4c0.f201518c1), "https://auto.tancdn.com/v1/images/eyJpZCI6IkZCQzE3MTY4NDI5MzQ3RDg4NzU3QkQ3QUIxRTE3MzYyIiwidyI6NzAyLCJoIjo1NjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDA0NjMsInB0IjoyMDI1MTAxNzE5fQ.png", 700, 560);
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.g9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.Companion.m120098a(view);
                }
            });
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.h9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.Companion.m120100c(onUnlock, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.i9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f9p.Companion.m120099b(view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: f */
        public final void m120103f() {
            f9p f9pVar;
            if (m120104g() != null) {
                Companion companion = f9p.INSTANCE;
                WeakReference<f9p> weakReferenceM120104g = companion.m120104g();
                if (weakReferenceM120104g != null && (f9pVar = weakReferenceM120104g.get()) != null) {
                    f9pVar.dismiss();
                }
                companion.m120105h(null);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final WeakReference<f9p> m120104g() {
            return f9p.f96500j;
        }

        /* JADX INFO: renamed from: h */
        public final void m120105h(@Nullable WeakReference<f9p> weakReference) {
            f9p.f96500j = weakReference;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final f9p m120106i(@NotNull Context ctx, boolean compact, @NotNull List<? extends SalvagePopUser> users, @Nullable Runnable onUnlock, @Nullable e30<User> onSuperLikeSend, @Nullable e30<User> onLikeSend, @Nullable e30<User> onOpenProfile) {
            RecyclerView.Adapter adapter;
            ctx.getClass();
            users.getClass();
            f9p f9pVar = new f9p(ctx, m120102e(ctx, compact, users, onUnlock, onSuperLikeSend, onLikeSend, onOpenProfile), null);
            m120105h(new WeakReference<>(f9pVar));
            f9pVar.show();
            RecyclerView recyclerView = (RecyclerView) f9pVar.findViewById(z4c0.f201473H0);
            if (!compact) {
                u9p u9pVar = u9p.INSTANCE;
                xdl0.m208327D0(C15167a.m87599e((int) (((double) u9pVar.m192611n()) * u9pVar.m192613p()), u9pVar.m192612o()), recyclerView);
            }
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            return f9pVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ f9p(Context context, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view);
    }
}
