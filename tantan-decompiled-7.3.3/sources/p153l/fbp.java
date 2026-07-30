package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SalvagePopUser;
import com.p051p1.mobile.putong.core.data.SalvagePopUserType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m88121d2 = {"Ll/fbp;", "Ll/g1e;", "Landroid/content/Context;", "context", "Landroid/view/View;", "content", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "Companion", "c", "a", Constants.INAPP_DATA_TAG, "e", "b", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fbp extends g1e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static WeakReference<fbp> f98121j;

    /* JADX INFO: renamed from: l.fbp$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/fbp$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/fbp$e;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/y20;Ll/y20;Ll/y20;)V", "Landroid/view/ViewGroup;", "p", "", "vt", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/fbp$e;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/fbp$e;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/y20;", "c", Constants.INAPP_DATA_TAG, "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16938a extends RecyclerView.Adapter<C16942e> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onSuperLikeSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onLikeSend;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C16938a(@NotNull List<? extends SalvagePopUser> list, @Nullable y20<User> y20Var, @Nullable y20<User> y20Var2, @Nullable y20<User> y20Var3) {
            list.getClass();
            this.data = list;
            this.onSuperLikeSend = y20Var;
            this.onLikeSend = y20Var2;
            this.onOpenProfile = y20Var3;
        }

        /* JADX INFO: renamed from: y */
        public static void m124901y(Ref.BooleanRef booleanRef, C16938a c16938a, User user, View view) {
            ubp.INSTANCE.m195288w(booleanRef.element ? "superlike" : "like");
            y20<User> y20Var = booleanRef.element ? c16938a.onSuperLikeSend : c16938a.onLikeSend;
            if (y20Var != null) {
                y20Var.call(user);
            }
            fbp.INSTANCE.m124910f();
        }

        /* JADX INFO: renamed from: z */
        public static void m124902z(C16938a c16938a, User user, View view) {
            ubp.INSTANCE.m195288w("profile");
            y20<User> y20Var = c16938a.onOpenProfile;
            if (y20Var != null) {
                y20Var.call(user);
            }
            fbp.INSTANCE.m124910f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C16942e h, int i) {
            h.getClass();
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (TEnum.equals(salvagePopUser.salvagePopUserType, SalvagePopUserType.rightSwipe)) {
                booleanRef.element = true;
                uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
                if (IntlCountryCodeController.m29125v()) {
                    h.getHeart().setBackgroundResource(jbc0.f119228G1);
                } else {
                    h.getHeart().setBackgroundResource(jbc0.f119200E1);
                }
            } else {
                booleanRef.element = false;
                if (joa.m146392i4()) {
                    uqb0.f180374G.m127120O(h.getImg(), user.m61308fp().profile480().formatted(), 4, 35);
                } else {
                    uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
                }
                if (IntlCountryCodeController.m29125v()) {
                    h.getHeart().setBackgroundResource(jbc0.f119186D1);
                } else {
                    h.getHeart().setBackgroundResource(jbc0.f119172C1);
                }
            }
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.dbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.C16938a.m124902z(this.f87689a, user, view);
                }
            });
            h.getHeart().setOnClickListener(new View.OnClickListener() { // from class: l.ebp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.C16938a.m124901y(booleanRef, this, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C16942e onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(rec0.f162445H, p, false);
            viewInflate.getClass();
            return new C16942e(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.fbp$c */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/fbp$c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/fbp$d;", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "data", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "<init>", "(Ljava/util/List;Ll/y20;Ll/y20;Ll/y20;)V", "Landroid/view/ViewGroup;", "p", "", "vt", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/fbp$d;", "h", RXScreenCaptureService.KEY_INDEX, "", "A", "(Ll/fbp$d;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "b", "Ll/y20;", "c", Constants.INAPP_DATA_TAG, "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16940c extends RecyclerView.Adapter<C16941d> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<SalvagePopUser> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onSuperLikeSend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onLikeSend;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final y20<User> onOpenProfile;

        /* JADX WARN: Multi-variable type inference failed */
        public C16940c(@NotNull List<? extends SalvagePopUser> list, @Nullable y20<User> y20Var, @Nullable y20<User> y20Var2, @Nullable y20<User> y20Var3) {
            list.getClass();
            this.data = list;
            this.onSuperLikeSend = y20Var;
            this.onLikeSend = y20Var2;
            this.onOpenProfile = y20Var3;
        }

        /* JADX INFO: renamed from: y */
        public static void m124914y(Ref.BooleanRef booleanRef, C16940c c16940c, User user, View view) {
            ubp.INSTANCE.m195288w(booleanRef.element ? "superlike" : "like");
            y20<User> y20Var = booleanRef.element ? c16940c.onSuperLikeSend : c16940c.onLikeSend;
            if (y20Var != null) {
                y20Var.call(user);
            }
            fbp.INSTANCE.m124910f();
        }

        /* JADX INFO: renamed from: z */
        public static void m124915z(C16940c c16940c, User user, View view) {
            ubp.INSTANCE.m195288w("profile");
            y20<User> y20Var = c16940c.onOpenProfile;
            if (y20Var != null) {
                y20Var.call(user);
            }
            fbp.INSTANCE.m124910f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C16941d h, int i) {
            h.getClass();
            ViewGroup.LayoutParams layoutParams = h.getRoot().getLayoutParams();
            layoutParams.height = ubp.INSTANCE.m195279n();
            h.getRoot().setLayoutParams(layoutParams);
            SalvagePopUser salvagePopUser = this.data.get(i);
            final User user = salvagePopUser.user;
            user.getClass();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String strMo34565pi = CoreModule.m30933P().m143405a().mo34565pi(user.location.distance);
            h.getMeta().setText(strMo34565pi + "·" + user.age);
            if (TEnum.equals(salvagePopUser.salvagePopUserType, SalvagePopUserType.rightSwipe)) {
                booleanRef.element = true;
                uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
                if (IntlCountryCodeController.m29125v()) {
                    h.getStar().setBackgroundResource(jbc0.f119242H1);
                } else {
                    h.getStar().setBackgroundResource(jbc0.f119214F1);
                }
            } else {
                booleanRef.element = false;
                if (joa.m146392i4()) {
                    uqb0.f180374G.m127120O(h.getImg(), user.m61308fp().profile480().formatted(), 4, 35);
                } else {
                    uqb0.f180374G.m127115L0(h.getImg(), user.m61308fp().profile480().formatted());
                }
                if (IntlCountryCodeController.m29125v()) {
                    h.getStar().setBackgroundResource(jbc0.f119186D1);
                } else {
                    h.getStar().setBackgroundResource(jbc0.f119172C1);
                }
            }
            h.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.jbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.C16940c.m124915z(this.f119985a, user, view);
                }
            });
            h.getStar().setOnClickListener(new View.OnClickListener() { // from class: l.kbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.C16940c.m124914y(booleanRef, this, user, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C16941d onCreateViewHolder(@NotNull ViewGroup p, int vt) {
            p.getClass();
            View viewInflate = LayoutInflater.from(p.getContext()).inflate(rec0.f162449I, p, false);
            viewInflate.getClass();
            return new C16941d(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }
    }

    /* JADX INFO: renamed from: l.fbp$d */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\r\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/fbp$d;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", ResourceDirection.f39656v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "()Landroid/widget/ImageView;", "setStar", "(Landroid/widget/ImageView;)V", "star", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setMeta", "(Landroid/widget/TextView;)V", "meta", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16941d extends RecyclerView.AbstractC0569e0 {

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
        public C16941d(@NotNull View view) {
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
            this.star = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(fdc0.f98403f1);
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

    /* JADX INFO: renamed from: l.fbp$e */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/fbp$e;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", ResourceDirection.f39656v, "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "setRoot", "root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "()Lv/VDraweeView;", "setImg", "(Lv/VDraweeView;)V", "img", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setHeart", "(Landroid/widget/ImageView;)V", Sticker.GESTURE_TYPE_HEART, "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16942e extends RecyclerView.AbstractC0569e0 {

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
        public C16942e(@NotNull View view) {
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

    public fbp(Context context, View view) {
        super(context, false, dgc0.f88286k);
        setCancelable(true);
        m128500x();
        setCanceledOnTouchOutside(true);
        m128502z(view);
    }

    /* JADX INFO: renamed from: l.fbp$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R,\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/fbp$b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "compact", "", "Lcom/p1/mobile/putong/core/data/SalvagePopUser;", "users", "Ljava/lang/Runnable;", "onUnlock", "Ll/y20;", "Lcom/p1/mobile/putong/data/User;", "onSuperLikeSend", "onLikeSend", "onOpenProfile", "Ll/fbp;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;ZLjava/util/List;Ljava/lang/Runnable;Ll/y20;Ll/y20;Ll/y20;)Ll/fbp;", "Landroid/view/View;", "e", "(Landroid/content/Context;ZLjava/util/List;Ljava/lang/Runnable;Ll/y20;Ll/y20;Ll/y20;)Landroid/view/View;", "", "f", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "g", "()Ljava/lang/ref/WeakReference;", "h", "(Ljava/lang/ref/WeakReference;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m124905a(View view) {
            Companion companion = fbp.INSTANCE;
            WeakReference<fbp> weakReferenceM124911g = companion.m124911g();
            weakReferenceM124911g.getClass();
            if (weakReferenceM124911g.get() != null) {
                WeakReference<fbp> weakReferenceM124911g2 = companion.m124911g();
                weakReferenceM124911g2.getClass();
                fbp fbpVar = weakReferenceM124911g2.get();
                fbpVar.getClass();
                fbpVar.dismiss();
                companion.m124912h(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m124906b(View view) {
            fbp.INSTANCE.m124910f();
        }

        /* JADX INFO: renamed from: c */
        public static void m124907c(Runnable runnable, View view) {
            ubp.INSTANCE.m195289x();
            if (runnable != null) {
                runnable.run();
            }
            fbp.INSTANCE.m124910f();
        }

        /* JADX INFO: renamed from: e */
        public final View m124909e(Context ctx, boolean compact, List<? extends SalvagePopUser> users, final Runnable onUnlock, y20<User> onSuperLikeSend, y20<User> onLikeSend, y20<User> onOpenProfile) {
            View viewInflate = LayoutInflater.from(ctx).inflate(rec0.f162441G, (ViewGroup) null, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(fdc0.f98349H0);
            int i = compact ? 3 : 2;
            int i2 = compact ? qa00.f156322i : qa00.f156321h;
            recyclerView.setLayoutManager(new GridLayoutManager(ctx, i));
            recyclerView.setAdapter(compact ? new C16938a(users, onSuperLikeSend, onLikeSend, onOpenProfile) : new C16940c(users, onSuperLikeSend, onLikeSend, onOpenProfile));
            recyclerView.addItemDecoration(new pdk(i2, i));
            if (compact) {
                bnl0.m105540X(recyclerView, qa00.f156333t);
            }
            View viewFindViewById = viewInflate.findViewById(fdc0.f98347G0);
            if (!compact) {
                int i3 = qa00.f156323j;
                bnl0.m105550d0(viewFindViewById, i3);
                bnl0.m105552e0(viewFindViewById, i3);
            }
            View viewFindViewById2 = viewInflate.findViewById(fdc0.f98425n);
            View viewFindViewById3 = viewInflate.findViewById(fdc0.f98422m);
            View viewFindViewById4 = viewInflate.findViewById(fdc0.f98440t);
            uqb0.f180374G.m127109I0((VDraweeView) viewInflate.findViewById(fdc0.f98394c1), "https://auto.tancdn.com/v1/images/eyJpZCI6IkZCQzE3MTY4NDI5MzQ3RDg4NzU3QkQ3QUIxRTE3MzYyIiwidyI6NzAyLCJoIjo1NjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDA0NjMsInB0IjoyMDI1MTAxNzE5fQ.png", 700, 560);
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.gbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.Companion.m124905a(view);
                }
            });
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.hbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.Companion.m124907c(onUnlock, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ibp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbp.Companion.m124906b(view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: f */
        public final void m124910f() {
            fbp fbpVar;
            if (m124911g() != null) {
                Companion companion = fbp.INSTANCE;
                WeakReference<fbp> weakReferenceM124911g = companion.m124911g();
                if (weakReferenceM124911g != null && (fbpVar = weakReferenceM124911g.get()) != null) {
                    fbpVar.dismiss();
                }
                companion.m124912h(null);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final WeakReference<fbp> m124911g() {
            return fbp.f98121j;
        }

        /* JADX INFO: renamed from: h */
        public final void m124912h(@Nullable WeakReference<fbp> weakReference) {
            fbp.f98121j = weakReference;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final fbp m124913i(@NotNull Context ctx, boolean compact, @NotNull List<? extends SalvagePopUser> users, @Nullable Runnable onUnlock, @Nullable y20<User> onSuperLikeSend, @Nullable y20<User> onLikeSend, @Nullable y20<User> onOpenProfile) {
            RecyclerView.Adapter adapter;
            ctx.getClass();
            users.getClass();
            fbp fbpVar = new fbp(ctx, m124909e(ctx, compact, users, onUnlock, onSuperLikeSend, onLikeSend, onOpenProfile), null);
            m124912h(new WeakReference<>(fbpVar));
            fbpVar.show();
            RecyclerView recyclerView = (RecyclerView) fbpVar.findViewById(fdc0.f98349H0);
            if (!compact) {
                ubp ubpVar = ubp.INSTANCE;
                bnl0.m105507D0(C15274a.m88489e((int) (((double) ubpVar.m195279n()) * ubpVar.m195281p()), ubpVar.m195280o()), recyclerView);
            }
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            return fbpVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ fbp(Context context, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view);
    }
}
