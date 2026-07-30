package p003l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMyCustomMemeAct;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.c3c0;
import l.e51;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.ogw;
import l.qib0;
import l.roj0;
import l.szb0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wyq extends eb2 {

    /* JADX INFO: renamed from: e */
    public C0631h f8641e;

    /* JADX INFO: renamed from: f */
    public C0633j f8642f;

    /* JADX INFO: renamed from: g */
    public C0635l f8643g;

    /* JADX INFO: renamed from: h */
    public List<ListAdapter> f8644h;

    /* JADX INFO: renamed from: i */
    public List<ListAdapter> f8645i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f8646j;

    /* JADX INFO: renamed from: k */
    public List<j760<StickerBundle, StickerPackage>> f8647k;

    /* JADX INFO: renamed from: l */
    public EditText f8648l;

    /* JADX INFO: renamed from: m */
    public Act f8649m;

    /* JADX INFO: renamed from: n */
    public e30<Sticker> f8650n;

    /* JADX INFO: renamed from: o */
    public d30 f8651o;

    /* JADX INFO: renamed from: p */
    public boolean f8652p;

    /* JADX INFO: renamed from: q */
    public boolean f8653q;

    /* JADX INFO: renamed from: r */
    public boolean f8654r;

    /* JADX INFO: renamed from: s */
    public Set<Object> f8655s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f8656t;

    /* JADX INFO: renamed from: u */
    public C0634k f8657u;

    /* JADX INFO: renamed from: v */
    public boolean f8658v;

    /* JADX INFO: renamed from: w */
    public Runnable f8659w;

    /* JADX INFO: renamed from: l.wyq$a */
    public class C0624a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f8660a;

        public C0624a(int i) {
            this.f8660a = i;
        }

        /* JADX INFO: renamed from: f */
        public int m8632f(int i) {
            int itemViewType = wyq.this.f8642f.getItemViewType(i);
            if (itemViewType == 0) {
                return this.f8660a;
            }
            if (itemViewType != 1) {
                return 1;
            }
            return this.f8660a;
        }
    }

    /* JADX INFO: renamed from: l.wyq$b */
    public class C0625b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f8662a;

        public C0625b(View view) {
            this.f8662a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.a(this.f8662a.getParent())) {
                this.f8662a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wyq$c */
    public class C0626c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f8664a;

        public C0626c(View view) {
            this.f8664a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.a(this.f8664a.getParent())) {
                this.f8664a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wyq$d */
    public class ViewOnTouchListenerC0627d implements View.OnTouchListener {
        public ViewOnTouchListenerC0627d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                wyq.this.f8658v = false;
                wyq.this.m8618T();
            } else if (motionEvent.getAction() == 1) {
                if (xdl0.O(view, motionEvent) && !wyq.this.f8658v) {
                    wyq.this.m8609K();
                }
                wyq.this.m8619U();
            } else if (motionEvent.getAction() == 3) {
                wyq.this.m8619U();
            } else if (!xdl0.O(view, motionEvent)) {
                wyq.this.m8619U();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.wyq$e */
    public class RunnableC0628e implements Runnable {
        public RunnableC0628e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wyq.this.f8658v = true;
            boolean zM8609K = wyq.this.m8609K();
            if (!NullChecker.a(wyq.this.f8659w) || zM8609K) {
                return;
            }
            wyq wyqVar = wyq.this;
            e51.H(wyqVar.f8649m, wyqVar.f8659w, 130L);
        }
    }

    /* JADX INFO: renamed from: l.wyq$f */
    public class C0629f extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public int f8668a = (((xdl0.y0() - t100.d(24.0f)) / 7) - t100.d(40.0f)) / 6;

        /* JADX INFO: renamed from: b */
        public int f8669b;

        public C0629f(int i) {
            this.f8669b = i;
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f8669b;
            if (i == 0) {
                rect.left = (childAdapterPosition % 7) * this.f8668a;
                return;
            }
            if (childAdapterPosition == 0 || childAdapterPosition == i) {
                rect.left = 0;
                return;
            }
            if (childAdapterPosition >= i) {
                childAdapterPosition -= i;
            }
            rect.left = ((childAdapterPosition - 1) % 7) * this.f8668a;
        }
    }

    /* JADX INFO: renamed from: l.wyq$g */
    public class C0630g extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f8671c;

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f8672d;

        /* JADX INFO: renamed from: e */
        public Act f8673e;

        /* JADX INFO: renamed from: f */
        public PopupWindow f8674f;

        /* JADX INFO: renamed from: l.wyq$g$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f8676a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f8677b;

            public a(View view, Sticker sticker) {
                this.f8676a = view;
                this.f8677b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0630g c0630g = C0630g.this;
                c0630g.f8674f = c0630g.m8645F(this.f8676a.getContext(), this.f8677b);
                C0630g c0630g2 = C0630g.this;
                c0630g2.m8637L(c0630g2.f8674f, this.f8676a, view);
                return true;
            }
        }

        public C0630g(e30<Sticker> e30Var, StickerPackage stickerPackage, Act act) {
            this.f8672d = e30Var;
            if (stickerPackage == null || vwb.J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f8671c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f8671c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f8671c;
            stickerPackage2.stickers = vwb.n(stickerPackage2.stickers, new w9j() { // from class: l.bzq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return wyq.C0630g.m8643z((String) obj);
                }
            });
            this.f8673e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public void m8637L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iY0 = xdl0.y0();
            int i2 = t100.g;
            if (measuredWidth > iY0 - i2) {
                width = (xdl0.y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            if (wyq.this.f8654r) {
                contentView.getLocationInWindow(iArr);
                ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.czq
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        wyq.C0630g.m8638p(view2);
                    }
                });
            }
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m8638p(View view) {
            if (NullChecker.a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: w */
        public static /* synthetic */ boolean m8641w(View view) {
            return false;
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ Boolean m8643z(String str) {
            Sticker stickerS3 = CoreModule.c.Z.s3(str);
            return NullChecker.a(stickerS3) ? Boolean.valueOf(ServletHandler.__DEFAULT_SERVLET.equals(stickerS3.status)) : Boolean.FALSE;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo1005j(final View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            SimpleDraweeView simpleDraweeView = (VDraweeView) view.findViewById(y4c0.C1);
            if (i2 == 0) {
                if (wyq.this.m8614P()) {
                    simpleDraweeView.setImageResource(0);
                    simpleDraweeView.setBackgroundResource(c3c0.B1);
                } else if (wyq.this.f8654r) {
                    simpleDraweeView.setBackgroundResource(ura.e().d().I4() ? c3c0.d2 : c3c0.h2);
                    simpleDraweeView.setImageResource(ura.e().d().I4() ? c3c0.f2 : c3c0.I3);
                } else {
                    simpleDraweeView.setImageResource(ura.e().d().I4() ? c3c0.f2 : c3c0.e2);
                    simpleDraweeView.setBackgroundResource(ura.e().d().I4() ? c3c0.d2 : c3c0.c2);
                }
                simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                zvf0.x("e_chat_collect_gifs_operation", "p_chat_view");
                xdl0.L(linearLayout, new View.OnClickListener() { // from class: l.yyq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f9179a.m8646G(view, view2);
                    }
                });
                linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.zyq
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return wyq.C0630g.m8641w(view2);
                    }
                });
                return;
            }
            final Sticker stickerS3 = CoreModule.c.Z.s3(str);
            if (!NullChecker.a(stickerS3) || stickerS3.pictures.isEmpty()) {
                qib0.G.o(simpleDraweeView);
                return;
            }
            if (wyq.this.f8654r) {
                CoreModule.N().R9(simpleDraweeView, 10.0f);
            }
            simpleDraweeView.setBackgroundResource(0);
            linearLayout.setTag(stickerS3);
            if (wyq.this.f8654r) {
                zvf0.A("e_chat_gif_click", "p_chat_view", new j760[]{vwb.Y("gif_source", "collect"), vwb.Y("gift_url", ((Media) ((Picture) stickerS3.pictures.get(0))).url), vwb.Y("gifs_order", (i2 + 1) + "")});
            }
            xdl0.L(linearLayout, new View.OnClickListener() { // from class: l.azq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f2327a.m8647H(stickerS3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerS3));
            if (TEnum.equals(stickerS3.source, "shanmeng")) {
                qib0.G.L0(simpleDraweeView, ((Media) ((Picture) stickerS3.pictures.get(0))).url);
            } else {
                qib0.G.B0(simpleDraweeView, m8651M((Picture) stickerS3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: F */
        public final PopupWindow m8645F(Context context, final Sticker sticker) {
            View viewInflate = wyq.this.f8654r ? o7r.a(context).inflate(l6c0.j1, (ViewGroup) null) : o7r.a(context).inflate(l6c0.i1, (ViewGroup) null);
            SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.G.L0(simpleDraweeView, ((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
            AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.D2);
            AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.p0);
            appCompatTextView.getPaint().setFakeBoldText(true);
            appCompatTextView2.getPaint().setFakeBoldText(true);
            zvf0.x("e_chat_collect_gif_operation", "p_chat_view");
            xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.dzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3174a.m8648I(sticker, popupWindow, view);
                }
            });
            xdl0.E0(appCompatTextView2, new View.OnClickListener() { // from class: l.ezq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3427a.m8649J(sticker, popupWindow, view);
                }
            });
            wyq wyqVar = wyq.this;
            if (!wyqVar.f8654r) {
                wyqVar.m8628d0(viewInflate, appCompatTextView, appCompatTextView2);
                return popupWindow;
            }
            CoreModule.N().R9(simpleDraweeView, 10.0f);
            wyq.this.m8626b0(viewInflate, appCompatTextView, appCompatTextView2);
            return popupWindow;
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m8646G(View view, View view2) {
            if (wyq.this.f8654r) {
                zvf0.r("e_chat_collect_gifs_operation", "p_chat_view");
            }
            view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) CoreMyCustomMemeAct.class));
            this.f8673e.overridePendingTransition(szb0.e, szb0.a);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m8647H(Sticker sticker, int i, View view) {
            if (wyq.this.f8654r) {
                zvf0.u("e_chat_gif_click", "p_chat_view", new j760[]{vwb.Y("gif_source", "collect"), vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("gifs_order", (i + 1) + "")});
            } else {
                zvf0.u("e_stickers", "p_chat_view", new j760[]{vwb.Y("stickers_id", this.f8671c.id), vwb.Y("sticker_rank", Integer.valueOf(i))});
            }
            this.f8672d.call((Sticker) view.getTag());
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m8648I(Sticker sticker, PopupWindow popupWindow, View view) {
            if (wyq.this.f8654r) {
                zvf0.u("e_chat_collect_gif_operation", "p_chat_view", new j760[]{vwb.Y("collect_operation", "top")});
            } else {
                zvf0.u("e_stickers_move_to_front", "p_chat_view", new j760[]{vwb.Y("stickers_id_new", ((DbObject) sticker).id)});
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(((DbObject) sticker).id);
            CoreModule.c.Z.T.W(userStickerNew_);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m8649J(Sticker sticker, PopupWindow popupWindow, View view) {
            if (wyq.this.f8654r) {
                zvf0.u("e_chat_collect_gif_operation", "p_chat_view", new j760[]{vwb.Y("collect_operation", "delete")});
            } else {
                zvf0.u("e_stickers_delete", "p_chat_view", new j760[]{vwb.Y("stickers_id_new", ((DbObject) sticker).id)});
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(((DbObject) sticker).id);
            CoreModule.c.Z.T.P(userStickerNew_);
        }

        /* JADX INFO: renamed from: K */
        public void m8650K(StickerPackage stickerPackage) {
            if (stickerPackage == null || vwb.J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f8671c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f8671c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f8671c;
            stickerPackage2.stickers = vwb.n(stickerPackage2.stickers, new w9j() { // from class: l.xyq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(ServletHandler.__DEFAULT_SERVLET.equals(CoreModule.c.Z.s3((String) obj).status));
                }
            });
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m8651M(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8671c.stickers.size() + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f8671c.stickers.get(i - 1);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            View viewInflate = wyq.this.f8654r ? o7r.a(viewGroup.getContext()).inflate(l6c0.j2, (ViewGroup) null) : o7r.a(viewGroup.getContext()).inflate(l6c0.q2, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iY0 = wyq.this.f8654r ? (xdl0.y0() - t100.d(4.0f)) / 4 : xdl0.y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY0);
            }
            layoutParams.width = iY0;
            layoutParams.height = iY0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.wyq$h */
    public class C0631h extends wp1<kye.C0395a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<kye.C0395a> f8679c;

        /* JADX INFO: renamed from: d */
        public final e30<String> f8680d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f8681e;

        /* JADX INFO: renamed from: l.wyq$h$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f8683a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kye.C0395a f8684b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f8685c;

            public a(View view, kye.C0395a c0395a, String str) {
                this.f8683a = view;
                this.f8684b = c0395a;
                this.f8685c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0631h c0631h = C0631h.this;
                c0631h.f8681e = wyq.this.m8613O(this.f8683a.getContext(), this.f8684b.f5137d, this.f8685c);
                C0631h c0631h2 = C0631h.this;
                wyq.this.m8631g0(c0631h2.f8681e, this.f8683a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.wyq$h$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.a(C0631h.this.f8681e) || !C0631h.this.f8681e.isShowing()) {
                    return false;
                }
                C0631h.this.f8681e.dismiss();
                return false;
            }
        }

        public C0631h(e30<String> e30Var, ArrayList<kye.C0395a> arrayList) {
            this.f8679c = arrayList;
            this.f8680d = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m8654w(kye.C0395a c0395a, View view) {
            this.f8680d.call(c0395a.f5134a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m8655y(View view) {
            this.f8680d.call((String) view.getTag());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8679c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f8679c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            return o7r.a(viewGroup.getContext()).inflate(l6c0.v3, viewGroup, false);
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, final kye.C0395a c0395a, int i, int i2) {
            String str;
            String string;
            ImageView imageView = (ImageView) view.findViewById(y4c0.D1);
            if (imageView == null || c0395a == null) {
                return;
            }
            int i3 = c0395a.f5137d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new fxe(imageView.getContext(), c0395a.f5134a, 24.0f, t100.d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.fzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f3777a.m8654w(c0395a, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(c0395a.f5134a)) {
                str = "[" + CoreModule.b.getString(c0395a.f5135b) + "]";
                string = CoreModule.b.getString(c0395a.f5135b);
            } else {
                str = "[" + c0395a.f5134a + "]";
                string = c0395a.f5134a;
            }
            view.setTag(str);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.gzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f4093a.m8655y(view2);
                }
            });
            view.setOnLongClickListener(new a(view, c0395a, string));
            view.setOnTouchListener(new b());
        }
    }

    /* JADX INFO: renamed from: l.wyq$i */
    public class C0632i extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f8688c;

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f8689d;

        /* JADX INFO: renamed from: l.wyq$i$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f8691a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f8692b;

            public a(View view, Sticker sticker) {
                this.f8691a = view;
                this.f8692b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0632i.this.m8657B(C0632i.this.m8661y(this.f8691a.getContext(), this.f8692b), this.f8691a);
                return true;
            }
        }

        public C0632i(e30<Sticker> e30Var, StickerPackage stickerPackage) {
            this.f8689d = e30Var;
            this.f8688c = stickerPackage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public void m8657B(PopupWindow popupWindow, View view) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iY0 = xdl0.y0();
            int i = t100.g;
            if (measuredWidth > iY0 - i) {
                width = (xdl0.y0() - i) - contentView.getMeasuredWidth();
            } else if (width < i) {
                width = i;
            }
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public PopupWindow m8661y(Context context, Sticker sticker) {
            View viewInflate = o7r.a(context).inflate(l6c0.p2, (ViewGroup) null);
            wyq.this.m8628d0(viewInflate, null, null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.y1);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.G.L0(vDraweeView, ((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
            return popupWindow;
        }

        /* JADX INFO: renamed from: A */
        public final void m8662A(View view, boolean z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int iY0 = xdl0.y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY0);
            }
            layoutParams.width = iY0;
            layoutParams.height = iY0 + (z ? t100.d(18.0f) : 0);
            view.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: C */
        public Picture.ImageUri m8663C(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8688c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f8688c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.q2, (ViewGroup) null);
            m8662A(viewInflate, false);
            return viewInflate;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            VDraweeView vDraweeView = (VDraweeView) linearLayout.findViewById(y4c0.C1);
            AppCompatTextView appCompatTextView = (VText) linearLayout.findViewById(y4c0.Q4);
            final Sticker stickerS3 = CoreModule.c.Z.s3(str);
            if (stickerS3.isChatheatSticker()) {
                xdl0.M(appCompatTextView, true);
                appCompatTextView.setText(stickerS3.name);
                m8662A(view, true);
            } else {
                xdl0.M(appCompatTextView, false);
                m8662A(view, false);
            }
            if (!NullChecker.a(stickerS3) || stickerS3.pictures.isEmpty()) {
                qib0.G.o(vDraweeView);
                return;
            }
            linearLayout.setTag(stickerS3);
            xdl0.L(linearLayout, new View.OnClickListener() { // from class: l.hzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f4310a.m8665z(stickerS3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerS3));
            if (TEnum.equals(stickerS3.source, "shanmeng")) {
                qib0.G.L0(vDraweeView, ((Media) ((Picture) stickerS3.pictures.get(0))).url);
            } else {
                qib0.G.B0(vDraweeView, m8663C((Picture) stickerS3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m8665z(Sticker sticker, int i, View view) {
            if (TEnum.equals(sticker.source, "intimate")) {
                zvf0.u("e_send_friends_emoji", "p_chat_view", new j760[]{vwb.Y("friends_emoji_name", sticker.name)});
            } else if (TEnum.equals(sticker.source, "poke")) {
                zvf0.u("e_send_chuochuo_emoji", "p_chat_view", new j760[]{vwb.Y("chuochuo_emoji_name", sticker.name)});
            }
            zvf0.u("e_stickers", "p_chat_view", new j760[]{vwb.Y("stickers_id", this.f8688c.id), vwb.Y("sticker_rank", Integer.valueOf(i))});
            this.f8689d.call((Sticker) view.getTag());
        }
    }

    /* JADX INFO: renamed from: l.wyq$j */
    public class C0633j extends RecyclerView.Adapter<RecyclerView.d0> {

        /* JADX INFO: renamed from: a */
        public ArrayList<kye.C0395a> f8694a;

        /* JADX INFO: renamed from: b */
        public ArrayList<kye.C0395a> f8695b;

        /* JADX INFO: renamed from: c */
        public final e30<String> f8696c;

        /* JADX INFO: renamed from: d */
        public PopupWindow f8697d;

        /* JADX INFO: renamed from: e */
        public int f8698e = 0;

        /* JADX INFO: renamed from: f */
        public RecyclerView f8699f;

        /* JADX INFO: renamed from: l.wyq$j$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LinearLayout f8701a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kye.C0395a f8702b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f8703c;

            public a(LinearLayout linearLayout, kye.C0395a c0395a, String str) {
                this.f8701a = linearLayout;
                this.f8702b = c0395a;
                this.f8703c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0633j c0633j = C0633j.this;
                wyq wyqVar = wyq.this;
                boolean z = wyqVar.f8654r;
                LinearLayout linearLayout = this.f8701a;
                if (z) {
                    c0633j.f8697d = wyqVar.m8612N(linearLayout.getContext(), this.f8702b.f5137d, this.f8703c);
                    C0633j c0633j2 = C0633j.this;
                    wyq.this.m8630f0(c0633j2.f8697d, this.f8701a, view);
                    return true;
                }
                c0633j.f8697d = wyqVar.m8613O(linearLayout.getContext(), this.f8702b.f5137d, this.f8703c);
                C0633j c0633j3 = C0633j.this;
                wyq.this.m8631g0(c0633j3.f8697d, this.f8701a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.a(C0633j.this.f8697d) || !C0633j.this.f8697d.isShowing()) {
                    return false;
                }
                C0633j.this.f8697d.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$c */
        public class c extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a */
            public TextView f8706a;

            public c(View view) {
                super(view);
                this.f8706a = (TextView) view.findViewById(y4c0.e);
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$d */
        public class d extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a */
            public ImageView f8708a;

            /* JADX INFO: renamed from: b */
            public LinearLayout f8709b;

            public d(View view) {
                super(view);
                this.f8708a = (ImageView) view.findViewById(y4c0.D1);
                this.f8709b = (LinearLayout) view.findViewById(y4c0.U0);
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$e */
        public class e extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a */
            public TextView f8711a;

            public e(View view) {
                super(view);
                this.f8711a = (TextView) view.findViewById(y4c0.H3);
            }
        }

        public C0633j(e30<String> e30Var, ArrayList<kye.C0395a> arrayList) {
            this.f8694a = arrayList;
            this.f8695b = arrayList;
            m8672F();
            this.f8696c = e30Var;
            m8673G();
        }

        /* JADX INFO: renamed from: A */
        public void m8668A(RecyclerView recyclerView) {
            this.f8699f = recyclerView;
            m8671E(recyclerView);
            recyclerView.addItemDecoration(wyq.this.new C0629f(this.f8698e));
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m8669C(kye.C0395a c0395a, View view) {
            this.f8696c.call(c0395a.f5134a);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m8670D(int i, kye.C0395a c0395a, View view) {
            zvf0.u("e_chat_emoji_click", "p_chat_view", new j760[]{vwb.Y("chat_emoji_type", i < this.f8698e ? "rencent" : "all")});
            if (wyq.this.f8649m.m2048B2()) {
                pxe.m6948c().m6959l(c0395a.f5138e);
                this.f8695b = pxe.m6948c().m6951a();
            }
            this.f8696c.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: E */
        public final void m8671E(RecyclerView recyclerView) {
            if (NullChecker.a(recyclerView)) {
                for (int itemDecorationCount = this.f8699f.getItemDecorationCount(); itemDecorationCount > 0; itemDecorationCount--) {
                    this.f8699f.removeItemDecorationAt(0);
                }
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m8672F() {
            this.f8698e = 0;
            if (this.f8694a.size() > kye.f5127d.size()) {
                for (int i = 0; i <= this.f8694a.size(); i++) {
                    if (TextUtils.equals(this.f8694a.get(i).f5138e, "all_text_tag_type")) {
                        this.f8698e = i;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m8673G() {
            zvf0.x("e_chat_emoji_click", "p_chat_view");
        }

        public int getItemCount() {
            return this.f8694a.size();
        }

        public int getItemViewType(int i) {
            if (TextUtils.equals(this.f8694a.get(i).f5138e, "recently_text_tag_type")) {
                return 0;
            }
            return TextUtils.equals(this.f8694a.get(i).f5138e, "all_text_tag_type") ? 1 : 2;
        }

        public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
            String str;
            String string;
            if (d0Var instanceof d) {
                d dVar = (d) d0Var;
                ImageView imageView = dVar.f8708a;
                LinearLayout linearLayout = dVar.f8709b;
                final kye.C0395a c0395a = this.f8694a.get(i);
                int i2 = c0395a.f5137d;
                if (i2 <= 0) {
                    imageView.setImageDrawable(new fxe(imageView.getContext(), c0395a.f5134a, 24.0f, t100.d(24.0f)));
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.izq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f4522a.m8669C(c0395a, view);
                        }
                    });
                    return;
                }
                imageView.setImageResource(i2);
                if (TextUtils.isEmpty(c0395a.f5134a)) {
                    str = "[" + CoreModule.b.getString(c0395a.f5135b) + "]";
                    string = CoreModule.b.getString(c0395a.f5135b);
                } else {
                    str = "[" + c0395a.f5134a + "]";
                    string = c0395a.f5134a;
                }
                linearLayout.setTag(str);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.jzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f4767a.m8670D(i, c0395a, view);
                    }
                });
                linearLayout.setOnLongClickListener(new a(linearLayout, c0395a, string));
                linearLayout.setOnTouchListener(new b());
            }
        }

        public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new e(wyq.this.f8649m.inflater().inflate(l6c0.f3, viewGroup, false));
            }
            wyq wyqVar = wyq.this;
            if (i == 1) {
                return new c(wyqVar.f8649m.inflater().inflate(l6c0.d3, viewGroup, false));
            }
            View viewInflate = wyqVar.f8649m.inflater().inflate(l6c0.e3, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iD = t100.d(40.0f);
            int iD2 = t100.d(60.0f);
            layoutParams.width = iD;
            layoutParams.height = iD2;
            viewInflate.setLayoutParams(layoutParams);
            return new d(viewInflate);
        }
    }

    /* JADX INFO: renamed from: l.wyq$l */
    public class C0635l extends RecyclerView.Adapter<RecyclerView.d0> {

        /* JADX INFO: renamed from: a */
        public List<Sticker> f8716a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public Act f8717b;

        /* JADX INFO: renamed from: l.wyq$l$a */
        public class a extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a */
            public VDraweeView f8719a;

            /* JADX INFO: renamed from: b */
            public FrameLayout f8720b;

            public a(View view) {
                super(view);
                this.f8719a = (VDraweeView) view.findViewById(y4c0.C1);
                this.f8720b = (FrameLayout) view.findViewById(y4c0.B5);
            }
        }

        public C0635l(Act act) {
            this.f8717b = act;
        }

        /* JADX INFO: renamed from: F */
        private PopupWindow m8678F(Context context, final Sticker sticker) {
            View viewInflate = o7r.a(context).inflate(l6c0.k1, (ViewGroup) null);
            SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.G.L0(simpleDraweeView, ((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
            AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.c);
            appCompatTextView.getPaint().setFakeBoldText(true);
            xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.ozq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6290a.m8682G(sticker, popupWindow, view);
                }
            });
            CoreModule.N().R9(simpleDraweeView, 10.0f);
            wyq.this.m8626b0(viewInflate, appCompatTextView, null);
            return popupWindow;
        }

        /* JADX INFO: renamed from: L */
        private void m8679L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iY0 = xdl0.y0();
            int i2 = t100.g;
            if (measuredWidth > iY0 - i2) {
                width = (xdl0.y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            contentView.getLocationInWindow(iArr);
            ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
            view2.getParent().requestDisallowInterceptTouchEvent(true);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.nzq
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    wyq.C0635l.m8681z(view2);
                }
            });
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m8681z(View view) {
            if (NullChecker.a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m8682G(Sticker sticker, PopupWindow popupWindow, View view) {
            zvf0.u("e_gif_add", "p_chat_view", new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url)});
            popupWindow.dismiss();
            wyq.this.m8608J(sticker);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean m8683H(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.a(intent)) {
                return false;
            }
            Sticker serializableExtra = intent.getSerializableExtra(CorePopularMemeAct.f1753o);
            if (!NullChecker.a(serializableExtra)) {
                return true;
            }
            this.f8717b.mo2066l().m4168R6(serializableExtra, TextUtils.isEmpty(((DbObject) serializableExtra).id));
            return true;
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m8684I(FrameLayout frameLayout, View view) {
            zvf0.r("e_chat_hot_gifs_search", "p_chat_view");
            Intent intent = new Intent(frameLayout.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f1748j, true);
            intent.putExtra(CorePopularMemeAct.f1749k, true);
            String string = this.f8717b.mo2046A0().m6499g0().m4844t0().getBar_center_text().getText().toString();
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra(CorePopularMemeAct.f1752n, string);
            }
            this.f8717b.startActivityForResult(18, intent, new com.p1.mobile.android.app.a.a() { // from class: l.pzq
                /* JADX INFO: renamed from: a */
                public final boolean m6970a(int i, int i2, Intent intent2) {
                    return this.f6557a.m8683H(i, i2, intent2);
                }
            });
            this.f8717b.overridePendingTransition(szb0.e, szb0.a);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m8685J(Sticker sticker, int i, View view) {
            zvf0.u("e_chat_gif_click", "p_chat_view", new j760[]{vwb.Y("gif_source", "gifs"), vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("gifs_order", (i + 1) + "")});
            if (NullChecker.a(sticker)) {
                this.f8717b.mo2066l().m4168R6(sticker, TextUtils.isEmpty(((DbObject) sticker).id));
            }
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ boolean m8686K(Sticker sticker, FrameLayout frameLayout, View view) {
            zvf0.A("e_gif_add", "p_chat_view", new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url)});
            m8679L(m8678F(frameLayout.getContext(), sticker), frameLayout, view);
            return true;
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m8687M(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        public int getItemCount() {
            return this.f8716a.size() + 1;
        }

        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, final int i) {
            a aVar = (a) d0Var;
            SimpleDraweeView simpleDraweeView = aVar.f8719a;
            final FrameLayout frameLayout = aVar.f8720b;
            if (i == 0) {
                simpleDraweeView.setBackgroundResource(ura.e().d().I4() ? c3c0.i2 : c3c0.h2);
                simpleDraweeView.setImageResource(ura.e().d().I4() ? c3c0.K3 : c3c0.J3);
                simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                zvf0.x("e_chat_hot_gifs_search", "p_chat_view");
                xdl0.L(frameLayout, new View.OnClickListener() { // from class: l.kzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5143a.m8684I(frameLayout, view);
                    }
                });
                return;
            }
            final Sticker sticker = this.f8716a.get(i - 1);
            if (!NullChecker.a(sticker) || sticker.pictures.isEmpty()) {
                qib0.G.o(simpleDraweeView);
            } else {
                frameLayout.setTag(sticker);
                simpleDraweeView.setBackgroundResource(0);
                if (TEnum.equals(sticker.source, "shanmeng")) {
                    qib0.G.L0(simpleDraweeView, ((Media) ((Picture) sticker.pictures.get(0))).url);
                    sticker.hash = ogw.e(((Media) ((Picture) sticker.pictures.get(0))).url);
                } else {
                    qib0.G.B0(simpleDraweeView, m8687M((Picture) sticker.pictures.get(0)));
                }
                zvf0.A("e_chat_gif_click", "p_chat_view", new j760[]{vwb.Y("gif_source", "gifs"), vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("gifs_order", (i + 1) + "")});
                xdl0.L(frameLayout, new View.OnClickListener() { // from class: l.lzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5483a.m8685J(sticker, i, view);
                    }
                });
                frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mzq
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f5812a.m8686K(sticker, frameLayout, view);
                    }
                });
            }
            CoreModule.N().R9(simpleDraweeView, 10.0f);
        }

        @NonNull
        public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = this.f8717b.inflater().inflate(l6c0.t1, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iY0 = (xdl0.y0() - t100.d(4.0f)) / 4;
            layoutParams.width = iY0;
            layoutParams.height = iY0;
            viewInflate.setLayoutParams(layoutParams);
            return new a(viewInflate);
        }
    }

    public wyq(Act act, e30<String> e30Var, e30<Sticker> e30Var2, EditText editText, ArrayList<kye.C0395a> arrayList, List<List<String>> list, d30 d30Var, boolean z, boolean z2) {
        this.f8653q = false;
        this.f8654r = false;
        this.f8655s = new HashSet();
        this.f8658v = false;
        this.f8659w = null;
        this.f8649m = act;
        this.f8650n = e30Var2;
        this.f8644h = new ArrayList();
        m8611M(e30Var, list);
        this.f8647k = new ArrayList();
        this.f8648l = editText;
        this.f8651o = d30Var;
        this.f8653q = z;
        this.f8652p = false;
        this.f8654r = z2;
        if (!z2) {
            this.f8641e = new C0631h(e30Var, arrayList);
        } else {
            this.f8642f = new C0633j(e30Var, arrayList);
            this.f8643g = new C0635l(act);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m8602u(Sticker sticker, roj0 roj0Var) {
        if (!vwb.J(sticker.pictures)) {
            qib0.G.x0(((Media) ((Picture) sticker.pictures.get(0))).url);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.G.x0(((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
        }
        lsi0.w(R.string.h6);
        e51.H(CoreModule.b, new Runnable() { // from class: l.uyq
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.Z.T.z();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m8604w(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.w(R.string.m6);
        } else {
            lsi0.w(R.string.g6);
            e51.H(CoreModule.b, new Runnable() { // from class: l.vyq
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.Z.T.z();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8606y(View view) {
    }

    /* JADX INFO: renamed from: J */
    public void m8608J(final Sticker sticker) {
        if (!NullChecker.a(CoreModule.c.Z.T.n()) || vwb.J(((CoreData) CoreModule.c.Z.T.n()).userStickers) || vwb.J(((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers) || ((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers.size() < 300) {
            this.f8649m.duringCreated(CoreModule.c.Z.T.O(sticker)).subscribe((m250) mkd0.H(new e30() { // from class: l.syq
                @Override // p003l.e30
                public final void call(Object obj) {
                    wyq.m8602u(sticker, (roj0) obj);
                }
            }, new e30() { // from class: l.tyq
                @Override // p003l.e30
                public final void call(Object obj) {
                    wyq.m8604w((Throwable) obj);
                }
            }));
        } else {
            lsi0.w(R.string.m6);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m8609K() {
        if (TextUtils.isEmpty(this.f8648l.getText())) {
            return true;
        }
        this.f8648l.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m8610L(View view, View view2) {
        if (xdl0.O0(view2)) {
            xdl0.W(view, -t100.d(10.0f));
        } else {
            xdl0.W(view, 0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8611M(final e30<String> e30Var, List<List<String>> list) {
        this.f8645i = new ArrayList();
        vwb.z(list, new e30() { // from class: l.qyq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6727a.m8615Q(e30Var, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public PopupWindow m8612N(Context context, int i, String str) {
        View viewInflate = o7r.a(context).inflate(l6c0.u3, (ViewGroup) null);
        AppCompatImageView appCompatImageView = (VImage) viewInflate.findViewById(y4c0.y1);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.A4);
        AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.M0);
        appCompatTextView.getPaint().setFakeBoldText(true);
        m8629e0(viewInflate, null, appCompatTextView);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        yt0.m9228b(str);
        if (yt0.m9228b(str)) {
            xdl0.M(appCompatTextView2, true);
            xdl0.M(appCompatImageView, false);
            appCompatTextView2.setText("[" + str + "]");
        } else {
            appCompatImageView.setImageResource(i);
        }
        appCompatTextView.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: O */
    public PopupWindow m8613O(Context context, int i, String str) {
        View viewInflate = o7r.a(context).inflate(l6c0.w3, (ViewGroup) null);
        AppCompatImageView appCompatImageView = (VImage) viewInflate.findViewById(y4c0.y1);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.A4);
        AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.M0);
        m8628d0(viewInflate, null, appCompatTextView);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        yt0.m9228b(str);
        if (yt0.m9228b(str)) {
            xdl0.M(appCompatTextView2, true);
            xdl0.M(appCompatImageView, false);
            appCompatTextView2.setText("[" + str + "]");
        } else {
            appCompatImageView.setImageResource(i);
        }
        appCompatTextView.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m8614P() {
        return this.f8653q;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8615Q(e30 e30Var, List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.ryq
            @Override // p003l.e30
            public final void call(Object obj) {
                arrayList.add(new kye.C0395a((String) obj, 0, 0));
            }
        });
        this.f8645i.add(new C0631h(e30Var, arrayList));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8616R(View view, View view2, View view3, Boolean bool) {
        if (this.f8653q) {
            return;
        }
        xdl0.M(view, bool.booleanValue());
        xdl0.M(view2, bool.booleanValue());
        if (!this.f8654r) {
            m8610L(view3, view2);
        } else {
            m8622X(bool.booleanValue());
            xdl0.W(view3, -t100.d(10.0f));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m8617S(View view) {
        if (NullChecker.a(this.f8651o)) {
            this.f8651o.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8618T() {
        if (this.f8659w == null) {
            this.f8659w = new RunnableC0628e();
        }
        e51.H(this.f8649m, this.f8659w, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: U */
    public final void m8619U() {
        if (NullChecker.a(this.f8659w)) {
            e51.J(this.f8659w);
            this.f8659w = null;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m8620V(List<j760<StickerBundle, StickerPackage>> list) {
        if (this.f8654r) {
            this.f8642f.notifyDataSetChanged();
        }
        if (this.f8652p) {
            if (vwb.J(list) || vwb.J(this.f8644h)) {
                return;
            }
            j760<StickerBundle, StickerPackage> j760Var = list.get(0);
            if (NullChecker.a(j760Var.b) && "custom_stickers".equals(((StickerPackage) j760Var.b).id) && (this.f8644h.get(0) instanceof C0630g)) {
                ((C0630g) this.f8644h.get(0)).m8650K((StickerPackage) j760Var.b);
                return;
            }
            return;
        }
        if (!vwb.J(list)) {
            this.f8647k.clear();
            this.f8644h.clear();
            this.f8647k.addAll(list);
        }
        for (j760<StickerBundle, StickerPackage> j760Var2 : this.f8647k) {
            if (NullChecker.a(j760Var2.b) && "custom_stickers".equals(((StickerPackage) j760Var2.b).id)) {
                this.f8644h.add(new C0630g(this.f8650n, (StickerPackage) j760Var2.b, this.f8649m));
            } else {
                this.f8644h.add(new C0632i(this.f8650n, (StickerPackage) j760Var2.b));
            }
        }
        notifyDataSetChanged();
        this.f8652p = true;
    }

    /* JADX INFO: renamed from: W */
    public void m8621W() {
        this.f8652p = false;
    }

    /* JADX INFO: renamed from: X */
    public final void m8622X(boolean z) {
        if (z) {
            xdl0.D0(Math.max(t100.d(169.0f), (xdl0.z0(this.f8649m) / 7) * 3), new View[]{this.f8656t});
        } else {
            xdl0.D0(Math.max(t100.d(72.0f), (xdl0.z0(this.f8649m) / 7) * 2), new View[]{this.f8656t});
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m8623Y() {
        for (Object obj : this.f8655s) {
            if (obj instanceof GridView) {
                ((GridView) obj).smoothScrollToPosition(0);
            } else if (obj instanceof RecyclerView) {
                ((RecyclerView) obj).smoothScrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m8624Z(final View view, final View view2, final View view3, int i) {
        boolean z = false;
        xdl0.M(view2, CoreModule.P().i().t1() && !this.f8653q);
        xdl0.M(view3, CoreModule.P().i().t1() && !this.f8653q);
        if (this.f8654r) {
            boolean z2 = CoreModule.P().i().t1() && !this.f8653q;
            xdl0.A0(this.f8649m, this.f8656t, c3c0.Q2);
            m8622X(z2);
            xdl0.W(view, -t100.d(10.0f));
        } else {
            m8610L(view, view3);
        }
        this.f8649m.duringCreated(CoreModule.P().i().Z1()).distinctUntilChanged().subscribe((m250) mkd0.G(new e30() { // from class: l.nyq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5998a.m8616R(view2, view3, view, (Boolean) obj);
            }
        }));
        xdl0.E0(view3, new View.OnClickListener() { // from class: l.oyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f6285a.m8617S(view4);
            }
        });
        String string = this.f8648l.getEditableText() == null ? null : this.f8648l.getEditableText().toString();
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C0634k c0634k = new C0634k(view, view3, i);
        this.f8657u = c0634k;
        this.f8648l.addTextChangedListener(c0634k);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.pyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                wyq.m8606y(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC0627d());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m8625a0(View view, int i) {
        xdl0.V(view, i);
        xdl0.W(view, i);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8626b0(View view, TextView textView, TextView textView2) {
        if (NullChecker.a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m8627c0(boolean z) {
        if (NullChecker.a(this.f8646j)) {
            this.f8646j.setNestedScrollingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8628d0(View view, TextView textView, TextView textView2) {
        if (m8614P()) {
            view.setBackgroundResource(c3c0.n2);
            if (NullChecker.a(textView)) {
                textView.setTextColor(Color.parseColor("#ccffffff"));
            }
            if (NullChecker.a(textView2)) {
                textView2.setTextColor(Color.parseColor("#ccffffff"));
                return;
            }
            return;
        }
        view.setBackgroundResource(c3c0.q4);
        if (NullChecker.a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8629e0(View view, TextView textView, TextView textView2) {
        if (NullChecker.a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m8630f0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int i = iArr[0];
        int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iY0 = xdl0.y0();
        int i2 = t100.a;
        if (measuredWidth > iY0 - i2) {
            width = (xdl0.y0() - i2) - contentView.getMeasuredWidth();
        } else if (width < i2) {
            width = i2;
        }
        contentView.getLocationInWindow(iArr);
        ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (t100.g + width);
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C0625b(view2));
    }

    /* JADX INFO: renamed from: g0 */
    public void m8631g0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iY0 = xdl0.y0();
        int i = t100.a;
        if (measuredWidth > iY0 - i) {
            width = (xdl0.y0() - i) - contentView.getMeasuredWidth();
        } else if (width < i) {
            width = i;
        }
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C0626c(view2));
    }

    public int getCount() {
        if (this.f8654r) {
            return 3;
        }
        return this.f8647k.size() + 3;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        if (i == 0 && NullChecker.a(this.f8657u)) {
            C0634k c0634k = this.f8657u;
            if (c0634k.f8715c == 0) {
                this.f8648l.removeTextChangedListener(c0634k);
            }
        }
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        if (i != 0 && i != 1 && i != 2) {
            if (this.f8654r && i == 2) {
                View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.X1, (ViewGroup) null);
                VRecyclerView vRecyclerView = (VRecyclerView) viewInflate.findViewById(y4c0.W0);
                vRecyclerView.setLayoutManager(new GridLayoutManager(this.f8649m, 4));
                vRecyclerView.setAdapter(this.f8643g);
                ((ViewPager) viewGroup).addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
                this.f8655s.add(vRecyclerView);
                return viewInflate;
            }
            GridView gridView = new GridView(viewGroup.getContext());
            gridView.setOverScrollMode(2);
            gridView.setScrollBarSize(0);
            gridView.setNumColumns(4);
            gridView.setColumnWidth(xdl0.y0() / 4);
            if (this.f8654r && i == 1) {
                gridView.setClipToPadding(false);
                xdl0.f0(gridView, t100.d(10.0f));
                xdl0.d0(gridView, t100.d(2.0f));
                xdl0.e0(gridView, t100.d(2.0f));
            }
            gridView.setAdapter(this.f8644h.get(i - 3));
            ((ViewPager) viewGroup).addView(gridView);
            if (this.f8654r) {
                gridView.setNestedScrollingEnabled(true);
                this.f8655s.add(gridView);
            }
            return gridView;
        }
        View viewInflate2 = this.f8654r ? o7r.a(viewGroup.getContext()).inflate(l6c0.W1, (ViewGroup) null) : o7r.a(viewGroup.getContext()).inflate(l6c0.r2, (ViewGroup) null);
        int iY0 = 7;
        if (this.f8654r) {
            this.f8646j = viewInflate2.findViewById(y4c0.J0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f8649m, 7);
            this.f8646j.setLayoutManager(gridLayoutManager);
            gridLayoutManager.v(new C0624a(7));
            this.f8642f.m8668A(this.f8646j);
            this.f8646j.setAdapter(this.f8642f);
            this.f8655s.add(this.f8646j);
        } else {
            GridView gridView2 = (GridView) viewInflate2.findViewById(y4c0.a);
            gridView2.setOverScrollMode(2);
            if (i == 0) {
                m8625a0(gridView2, t100.d(8.0f));
            } else {
                iY0 = xdl0.y0() / t100.d(60.0f);
                gridView2.setColumnWidth(t100.d(60.0f));
                m8625a0(gridView2, 0);
            }
            gridView2.setNumColumns(iY0);
            if (i == 0) {
                gridView2.setAdapter((ListAdapter) this.f8641e);
            } else {
                gridView2.setAdapter(this.f8645i.get(i));
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        int iY1 = (xdl0.y0() - (iY0 * t100.d(60.0f))) / 2;
        marginLayoutParams.setMargins(iY1, 0, iY1, 0);
        ((ViewPager) viewGroup).addView(viewInflate2, marginLayoutParams);
        View viewFindViewById = viewInflate2.findViewById(y4c0.L0);
        View viewFindViewById2 = viewInflate2.findViewById(y4c0.K0);
        ImageView imageView = (ImageView) viewInflate2.findViewById(y4c0.I0);
        this.f8656t = (FrameLayout) viewInflate2.findViewById(y4c0.H0);
        if (m8614P()) {
            viewFindViewById2.setBackgroundResource(c3c0.m2);
            imageView.setImageResource(c3c0.V3);
        } else if (this.f8654r) {
            viewFindViewById2.setBackgroundResource(ura.e().d().I4() ? c3c0.l2 : c3c0.k2);
            imageView.setImageResource(ura.e().d().I4() ? c3c0.U3 : c3c0.H3);
        } else {
            viewFindViewById2.setBackgroundResource(ura.e().d().I4() ? c3c0.l2 : c3c0.k2);
            imageView.setImageResource(ura.e().d().I4() ? c3c0.U3 : c3c0.T3);
        }
        m8624Z(imageView, viewFindViewById, viewFindViewById2, i);
        return viewInflate2;
    }

    public wyq(Act act, e30<String> e30Var, e30<Sticker> e30Var2, EditText editText, ArrayList<kye.C0395a> arrayList, List<List<String>> list, d30 d30Var, boolean z) {
        this.f8653q = false;
        this.f8654r = false;
        this.f8655s = new HashSet();
        this.f8658v = false;
        this.f8659w = null;
        this.f8649m = act;
        this.f8650n = e30Var2;
        this.f8641e = new C0631h(e30Var, arrayList);
        this.f8644h = new ArrayList();
        m8611M(e30Var, list);
        this.f8647k = new ArrayList();
        this.f8648l = editText;
        this.f8651o = d30Var;
        this.f8653q = z;
        this.f8652p = false;
    }

    /* JADX INFO: renamed from: l.wyq$k */
    public static class C0634k implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f8713a;

        /* JADX INFO: renamed from: b */
        public View f8714b;

        /* JADX INFO: renamed from: c */
        public int f8715c;

        public C0634k(View view, View view2, int i) {
            this.f8713a = view;
            this.f8714b = view2;
            this.f8715c = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.a(this.f8713a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f8713a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f8714b;
                if (string != null && !string.trim().isEmpty()) {
                    z = true;
                }
                view.setEnabled(z);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
