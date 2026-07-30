package p149l;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMyCustomMemeAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class wyq extends eb2 {

    /* JADX INFO: renamed from: e */
    public C21001h f188584e;

    /* JADX INFO: renamed from: f */
    public C21003j f188585f;

    /* JADX INFO: renamed from: g */
    public C21005l f188586g;

    /* JADX INFO: renamed from: h */
    public List<ListAdapter> f188587h;

    /* JADX INFO: renamed from: i */
    public List<ListAdapter> f188588i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f188589j;

    /* JADX INFO: renamed from: k */
    public List<j760<StickerBundle, StickerPackage>> f188590k;

    /* JADX INFO: renamed from: l */
    public EditText f188591l;

    /* JADX INFO: renamed from: m */
    public Act f188592m;

    /* JADX INFO: renamed from: n */
    public e30<Sticker> f188593n;

    /* JADX INFO: renamed from: o */
    public d30 f188594o;

    /* JADX INFO: renamed from: p */
    public boolean f188595p;

    /* JADX INFO: renamed from: q */
    public boolean f188596q;

    /* JADX INFO: renamed from: r */
    public boolean f188597r;

    /* JADX INFO: renamed from: s */
    public Set<Object> f188598s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f188599t;

    /* JADX INFO: renamed from: u */
    public C21004k f188600u;

    /* JADX INFO: renamed from: v */
    public boolean f188601v;

    /* JADX INFO: renamed from: w */
    public Runnable f188602w;

    /* JADX INFO: renamed from: l.wyq$a */
    public class C20994a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f188603a;

        public C20994a(int i) {
            this.f188603a = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = wyq.this.f188585f.getItemViewType(i);
            if (itemViewType == 0) {
                return this.f188603a;
            }
            if (itemViewType != 1) {
                return 1;
            }
            return this.f188603a;
        }
    }

    /* JADX INFO: renamed from: l.wyq$b */
    public class C20995b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f188605a;

        public C20995b(View view) {
            this.f188605a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.m81303a(this.f188605a.getParent())) {
                this.f188605a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wyq$c */
    public class C20996c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f188607a;

        public C20996c(View view) {
            this.f188607a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.m81303a(this.f188607a.getParent())) {
                this.f188607a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wyq$d */
    public class ViewOnTouchListenerC20997d implements View.OnTouchListener {
        public ViewOnTouchListenerC20997d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                wyq.this.f188601v = false;
                wyq.this.m206147T();
            } else if (motionEvent.getAction() == 1) {
                if (xdl0.m208348O(view, motionEvent) && !wyq.this.f188601v) {
                    wyq.this.m206138K();
                }
                wyq.this.m206148U();
            } else if (motionEvent.getAction() == 3) {
                wyq.this.m206148U();
            } else if (!xdl0.m208348O(view, motionEvent)) {
                wyq.this.m206148U();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.wyq$e */
    public class RunnableC20998e implements Runnable {
        public RunnableC20998e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wyq.this.f188601v = true;
            boolean zM206138K = wyq.this.m206138K();
            if (!NullChecker.m81303a(wyq.this.f188602w) || zM206138K) {
                return;
            }
            wyq wyqVar = wyq.this;
            e51.m114743H(wyqVar.f188592m, wyqVar.f188602w, 130L);
        }
    }

    /* JADX INFO: renamed from: l.wyq$f */
    public class C20999f extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public int f188611a = (((xdl0.m208412y0() - t100.m186890d(24.0f)) / 7) - t100.m186890d(40.0f)) / 6;

        /* JADX INFO: renamed from: b */
        public int f188612b;

        public C20999f(int i) {
            this.f188612b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f188612b;
            if (i == 0) {
                rect.left = (childAdapterPosition % 7) * this.f188611a;
                return;
            }
            if (childAdapterPosition == 0 || childAdapterPosition == i) {
                rect.left = 0;
                return;
            }
            if (childAdapterPosition >= i) {
                childAdapterPosition -= i;
            }
            rect.left = ((childAdapterPosition - 1) % 7) * this.f188611a;
        }
    }

    /* JADX INFO: renamed from: l.wyq$g */
    public class C21000g extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f188614c;

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f188615d;

        /* JADX INFO: renamed from: e */
        public Act f188616e;

        /* JADX INFO: renamed from: f */
        public PopupWindow f188617f;

        /* JADX INFO: renamed from: l.wyq$g$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f188619a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f188620b;

            public a(View view, Sticker sticker) {
                this.f188619a = view;
                this.f188620b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C21000g c21000g = C21000g.this;
                c21000g.f188617f = c21000g.m206173F(this.f188619a.getContext(), this.f188620b);
                C21000g c21000g2 = C21000g.this;
                c21000g2.m206165L(c21000g2.f188617f, this.f188619a, view);
                return true;
            }
        }

        public C21000g(e30<Sticker> e30Var, StickerPackage stickerPackage, Act act) {
            this.f188615d = e30Var;
            if (stickerPackage == null || vwb.m200296J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f188614c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f188614c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f188614c;
            stickerPackage2.stickers = vwb.m200339n(stickerPackage2.stickers, new w9j() { // from class: l.bzq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wyq.C21000g.m206171z((String) obj);
                }
            });
            this.f188616e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public void m206165L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM208412y0 = xdl0.m208412y0();
            int i2 = t100.f167258g;
            if (measuredWidth > iM208412y0 - i2) {
                width = (xdl0.m208412y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            if (wyq.this.f188597r) {
                contentView.getLocationInWindow(iArr);
                ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.f196143i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.czq
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        wyq.C21000g.m206166p(view2);
                    }
                });
            }
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m206166p(View view) {
            if (NullChecker.m81303a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: w */
        public static /* synthetic */ boolean m206169w(View view) {
            return false;
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ Boolean m206171z(String str) {
            Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(str);
            return NullChecker.m81303a(stickerM34927s3) ? Boolean.valueOf("default".equals(stickerM34927s3.status)) : Boolean.FALSE;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo20402j(final View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f195944C1);
            if (i2 == 0) {
                if (wyq.this.m206143P()) {
                    vDraweeView.setImageResource(0);
                    vDraweeView.setBackgroundResource(c3c0.f78478B1);
                } else if (wyq.this.f188597r) {
                    vDraweeView.setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78722d2 : c3c0.f78758h2);
                    vDraweeView.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78740f2 : c3c0.f78543I3);
                } else {
                    vDraweeView.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78740f2 : c3c0.f78731e2);
                    vDraweeView.setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78722d2 : c3c0.f78713c2);
                }
                vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                zvf0.m220402x("e_chat_collect_gifs_operation", OMSDialogPositon.p_chat_view);
                xdl0.m208342L(linearLayout, new View.OnClickListener() { // from class: l.yyq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f200794a.m206174G(view, view2);
                    }
                });
                linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.zyq
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return wyq.C21000g.m206169w(view2);
                    }
                });
                return;
            }
            final Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(str);
            if (!NullChecker.m81303a(stickerM34927s3) || stickerM34927s3.pictures.isEmpty()) {
                qib0.f154691G.m184725o(vDraweeView);
                return;
            }
            if (wyq.this.f188597r) {
                CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
            }
            vDraweeView.setBackgroundResource(0);
            linearLayout.setTag(stickerM34927s3);
            if (wyq.this.f188597r) {
                zvf0.m220368A("e_chat_gif_click", OMSDialogPositon.p_chat_view, vwb.m200311Y("gif_source", "collect"), vwb.m200311Y("gift_url", stickerM34927s3.pictures.get(0).url), vwb.m200311Y("gifs_order", (i2 + 1) + ""));
            }
            xdl0.m208342L(linearLayout, new View.OnClickListener() { // from class: l.azq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f72369a.m206175H(stickerM34927s3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerM34927s3));
            if (TEnum.equals(stickerM34927s3.source, "shanmeng")) {
                qib0.f154691G.m102331L0(vDraweeView, stickerM34927s3.pictures.get(0).url);
            } else {
                qib0.f154691G.m102312B0(vDraweeView, m206179M(stickerM34927s3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: F */
        public final PopupWindow m206173F(Context context, final Sticker sticker) {
            View viewInflate = wyq.this.f188597r ? o7r.m163037a(context).inflate(l6c0.f126496j1, (ViewGroup) null) : o7r.m163037a(context).inflate(l6c0.f126489i1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196257y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            VText vText = (VText) viewInflate.findViewById(y4c0.f195952D2);
            VText vText2 = (VText) viewInflate.findViewById(y4c0.f196193p0);
            vText.getPaint().setFakeBoldText(true);
            vText2.getPaint().setFakeBoldText(true);
            zvf0.m220402x("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.dzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88501a.m206176I(sticker, popupWindow, view);
                }
            });
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.ezq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93934a.m206177J(sticker, popupWindow, view);
                }
            });
            wyq wyqVar = wyq.this;
            if (!wyqVar.f188597r) {
                wyqVar.m206157d0(viewInflate, vText, vText2);
                return popupWindow;
            }
            CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
            wyq.this.m206155b0(viewInflate, vText, vText2);
            return popupWindow;
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m206174G(View view, View view2) {
            if (wyq.this.f188597r) {
                zvf0.m220396r("e_chat_collect_gifs_operation", OMSDialogPositon.p_chat_view);
            }
            view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) CoreMyCustomMemeAct.class));
            this.f188616e.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m206175H(Sticker sticker, int i, View view) {
            if (wyq.this.f188597r) {
                zvf0.m220399u("e_chat_gif_click", OMSDialogPositon.p_chat_view, vwb.m200311Y("gif_source", "collect"), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("gifs_order", (i + 1) + ""));
            } else {
                zvf0.m220399u("e_stickers", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id", this.f188614c.f20506id), vwb.m200311Y("sticker_rank", Integer.valueOf(i)));
            }
            this.f188615d.call((Sticker) view.getTag());
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m206176I(Sticker sticker, PopupWindow popupWindow, View view) {
            if (wyq.this.f188597r) {
                zvf0.m220399u("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view, vwb.m200311Y("collect_operation", StickStatus.top));
            } else {
                zvf0.m220399u("e_stickers_move_to_front", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id_new", sticker.f56011id));
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56011id);
            CoreModule.f17545c.f19624Z.f20143T.m34958W(userStickerNew_);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m206177J(Sticker sticker, PopupWindow popupWindow, View view) {
            if (wyq.this.f188597r) {
                zvf0.m220399u("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view, vwb.m200311Y("collect_operation", RequestParameters.SUBRESOURCE_DELETE));
            } else {
                zvf0.m220399u("e_stickers_delete", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id_new", sticker.f56011id));
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56011id);
            CoreModule.f17545c.f19624Z.f20143T.m34951P(userStickerNew_);
        }

        /* JADX INFO: renamed from: K */
        public void m206178K(StickerPackage stickerPackage) {
            if (stickerPackage == null || vwb.m200296J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f188614c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f188614c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f188614c;
            stickerPackage2.stickers = vwb.m200339n(stickerPackage2.stickers, new w9j() { // from class: l.xyq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("default".equals(CoreModule.f17545c.f19624Z.m34927s3((String) obj).status));
                }
            });
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m206179M(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f188614c.stickers.size() + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f188614c.stickers.get(i - 1);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            View viewInflate = wyq.this.f188597r ? o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126497j2, (ViewGroup) null) : o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126546q2, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM208412y0 = wyq.this.f188597r ? (xdl0.m208412y0() - t100.m186890d(4.0f)) / 4 : xdl0.m208412y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y0);
            }
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.wyq$h */
    public class C21001h extends wp1<kye.C18115a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<kye.C18115a> f188622c;

        /* JADX INFO: renamed from: d */
        public final e30<String> f188623d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f188624e;

        /* JADX INFO: renamed from: l.wyq$h$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f188626a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kye.C18115a f188627b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f188628c;

            public a(View view, kye.C18115a c18115a, String str) {
                this.f188626a = view;
                this.f188627b = c18115a;
                this.f188628c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C21001h c21001h = C21001h.this;
                c21001h.f188624e = wyq.this.m206142O(this.f188626a.getContext(), this.f188627b.f125289d, this.f188628c);
                C21001h c21001h2 = C21001h.this;
                wyq.this.m206160g0(c21001h2.f188624e, this.f188626a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.wyq$h$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m81303a(C21001h.this.f188624e) || !C21001h.this.f188624e.isShowing()) {
                    return false;
                }
                C21001h.this.f188624e.dismiss();
                return false;
            }
        }

        public C21001h(e30<String> e30Var, ArrayList<kye.C18115a> arrayList) {
            this.f188622c = arrayList;
            this.f188623d = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m206182w(kye.C18115a c18115a, View view) {
            this.f188623d.call(c18115a.f125286a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m206183y(View view) {
            this.f188623d.call((String) view.getTag());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f188622c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f188622c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126582v3, viewGroup, false);
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, final kye.C18115a c18115a, int i, int i2) {
            String str;
            String string;
            ImageView imageView = (ImageView) view.findViewById(y4c0.f195951D1);
            if (imageView == null || c18115a == null) {
                return;
            }
            int i3 = c18115a.f125289d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new fxe(imageView.getContext(), c18115a.f125286a, 24.0f, t100.m186890d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.fzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f99994a.m206182w(c18115a, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(c18115a.f125286a)) {
                str = "[" + CoreModule.f17544b.getString(c18115a.f125287b) + Constants.AES_SUFFIX;
                string = CoreModule.f17544b.getString(c18115a.f125287b);
            } else {
                str = "[" + c18115a.f125286a + Constants.AES_SUFFIX;
                string = c18115a.f125286a;
            }
            view.setTag(str);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.gzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f105165a.m206183y(view2);
                }
            });
            view.setOnLongClickListener(new a(view, c18115a, string));
            view.setOnTouchListener(new b());
        }
    }

    /* JADX INFO: renamed from: l.wyq$i */
    public class C21002i extends wp1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f188631c;

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f188632d;

        /* JADX INFO: renamed from: l.wyq$i$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f188634a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f188635b;

            public a(View view, Sticker sticker) {
                this.f188634a = view;
                this.f188635b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C21002i.this.m206185B(C21002i.this.m206189y(this.f188634a.getContext(), this.f188635b), this.f188634a);
                return true;
            }
        }

        public C21002i(e30<Sticker> e30Var, StickerPackage stickerPackage) {
            this.f188632d = e30Var;
            this.f188631c = stickerPackage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public void m206185B(PopupWindow popupWindow, View view) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM208412y0 = xdl0.m208412y0();
            int i = t100.f167258g;
            if (measuredWidth > iM208412y0 - i) {
                width = (xdl0.m208412y0() - i) - contentView.getMeasuredWidth();
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
        public PopupWindow m206189y(Context context, Sticker sticker) {
            View viewInflate = o7r.m163037a(context).inflate(l6c0.f126539p2, (ViewGroup) null);
            wyq.this.m206157d0(viewInflate, null, null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196257y1);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            return popupWindow;
        }

        /* JADX INFO: renamed from: A */
        public final void m206190A(View view, boolean z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int iM208412y0 = xdl0.m208412y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y0);
            }
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0 + (z ? t100.m186890d(18.0f) : 0);
            view.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: C */
        public Picture.ImageUri m206191C(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f188631c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f188631c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126546q2, (ViewGroup) null);
            m206190A(viewInflate, false);
            return viewInflate;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            VDraweeView vDraweeView = (VDraweeView) linearLayout.findViewById(y4c0.f195944C1);
            VText vText = (VText) linearLayout.findViewById(y4c0.f196032Q4);
            final Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(str);
            if (stickerM34927s3.isChatheatSticker()) {
                xdl0.m208344M(vText, true);
                vText.setText(stickerM34927s3.name);
                m206190A(view, true);
            } else {
                xdl0.m208344M(vText, false);
                m206190A(view, false);
            }
            if (!NullChecker.m81303a(stickerM34927s3) || stickerM34927s3.pictures.isEmpty()) {
                qib0.f154691G.m184725o(vDraweeView);
                return;
            }
            linearLayout.setTag(stickerM34927s3);
            xdl0.m208342L(linearLayout, new View.OnClickListener() { // from class: l.hzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f110221a.m206193z(stickerM34927s3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerM34927s3));
            if (TEnum.equals(stickerM34927s3.source, "shanmeng")) {
                qib0.f154691G.m102331L0(vDraweeView, stickerM34927s3.pictures.get(0).url);
            } else {
                qib0.f154691G.m102312B0(vDraweeView, m206191C(stickerM34927s3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m206193z(Sticker sticker, int i, View view) {
            if (TEnum.equals(sticker.source, "intimate")) {
                zvf0.m220399u("e_send_friends_emoji", OMSDialogPositon.p_chat_view, vwb.m200311Y("friends_emoji_name", sticker.name));
            } else if (TEnum.equals(sticker.source, "poke")) {
                zvf0.m220399u("e_send_chuochuo_emoji", OMSDialogPositon.p_chat_view, vwb.m200311Y("chuochuo_emoji_name", sticker.name));
            }
            zvf0.m220399u("e_stickers", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id", this.f188631c.f20506id), vwb.m200311Y("sticker_rank", Integer.valueOf(i)));
            this.f188632d.call((Sticker) view.getTag());
        }
    }

    /* JADX INFO: renamed from: l.wyq$j */
    public class C21003j extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

        /* JADX INFO: renamed from: a */
        public ArrayList<kye.C18115a> f188637a;

        /* JADX INFO: renamed from: b */
        public ArrayList<kye.C18115a> f188638b;

        /* JADX INFO: renamed from: c */
        public final e30<String> f188639c;

        /* JADX INFO: renamed from: d */
        public PopupWindow f188640d;

        /* JADX INFO: renamed from: e */
        public int f188641e = 0;

        /* JADX INFO: renamed from: f */
        public RecyclerView f188642f;

        /* JADX INFO: renamed from: l.wyq$j$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LinearLayout f188644a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kye.C18115a f188645b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f188646c;

            public a(LinearLayout linearLayout, kye.C18115a c18115a, String str) {
                this.f188644a = linearLayout;
                this.f188645b = c18115a;
                this.f188646c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C21003j c21003j = C21003j.this;
                wyq wyqVar = wyq.this;
                boolean z = wyqVar.f188597r;
                LinearLayout linearLayout = this.f188644a;
                if (z) {
                    c21003j.f188640d = wyqVar.m206141N(linearLayout.getContext(), this.f188645b.f125289d, this.f188646c);
                    C21003j c21003j2 = C21003j.this;
                    wyq.this.m206159f0(c21003j2.f188640d, this.f188644a, view);
                    return true;
                }
                c21003j.f188640d = wyqVar.m206142O(linearLayout.getContext(), this.f188645b.f125289d, this.f188646c);
                C21003j c21003j3 = C21003j.this;
                wyq.this.m206160g0(c21003j3.f188640d, this.f188644a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m81303a(C21003j.this.f188640d) || !C21003j.this.f188640d.isShowing()) {
                    return false;
                }
                C21003j.this.f188640d.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$c */
        public class c extends RecyclerView.AbstractC0566d0 {

            /* JADX INFO: renamed from: a */
            public TextView f188649a;

            public c(View view) {
                super(view);
                this.f188649a = (TextView) view.findViewById(y4c0.f196115e);
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$d */
        public class d extends RecyclerView.AbstractC0566d0 {

            /* JADX INFO: renamed from: a */
            public ImageView f188651a;

            /* JADX INFO: renamed from: b */
            public LinearLayout f188652b;

            public d(View view) {
                super(view);
                this.f188651a = (ImageView) view.findViewById(y4c0.f195951D1);
                this.f188652b = (LinearLayout) view.findViewById(y4c0.f196052U0);
            }
        }

        /* JADX INFO: renamed from: l.wyq$j$e */
        public class e extends RecyclerView.AbstractC0566d0 {

            /* JADX INFO: renamed from: a */
            public TextView f188654a;

            public e(View view) {
                super(view);
                this.f188654a = (TextView) view.findViewById(y4c0.f195977H3);
            }
        }

        public C21003j(e30<String> e30Var, ArrayList<kye.C18115a> arrayList) {
            this.f188637a = arrayList;
            this.f188638b = arrayList;
            m206200F();
            this.f188639c = e30Var;
            m206201G();
        }

        /* JADX INFO: renamed from: A */
        public void m206196A(RecyclerView recyclerView) {
            this.f188642f = recyclerView;
            m206199E(recyclerView);
            recyclerView.addItemDecoration(wyq.this.new C20999f(this.f188641e));
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m206197C(kye.C18115a c18115a, View view) {
            this.f188639c.call(c18115a.f125286a);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m206198D(int i, kye.C18115a c18115a, View view) {
            zvf0.m220399u("e_chat_emoji_click", OMSDialogPositon.p_chat_view, vwb.m200311Y("chat_emoji_type", i < this.f188641e ? "rencent" : "all"));
            if (((MessagesAct) wyq.this.f188592m).m48956B2()) {
                pxe.m171835c().m171846l(c18115a.f125290e);
                this.f188638b = pxe.m171835c().m171838a();
            }
            this.f188639c.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: E */
        public final void m206199E(RecyclerView recyclerView) {
            if (NullChecker.m81303a(recyclerView)) {
                for (int itemDecorationCount = this.f188642f.getItemDecorationCount(); itemDecorationCount > 0; itemDecorationCount--) {
                    this.f188642f.removeItemDecorationAt(0);
                }
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m206200F() {
            this.f188641e = 0;
            if (this.f188637a.size() > kye.f125279d.size()) {
                for (int i = 0; i <= this.f188637a.size(); i++) {
                    if (TextUtils.equals(this.f188637a.get(i).f125290e, "all_text_tag_type")) {
                        this.f188641e = i;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m206201G() {
            zvf0.m220402x("e_chat_emoji_click", OMSDialogPositon.p_chat_view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f188637a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (TextUtils.equals(this.f188637a.get(i).f125290e, "recently_text_tag_type")) {
                return 0;
            }
            return TextUtils.equals(this.f188637a.get(i).f125290e, "all_text_tag_type") ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, final int i) {
            String str;
            String string;
            if (abstractC0566d0 instanceof d) {
                d dVar = (d) abstractC0566d0;
                ImageView imageView = dVar.f188651a;
                LinearLayout linearLayout = dVar.f188652b;
                final kye.C18115a c18115a = this.f188637a.get(i);
                int i2 = c18115a.f125289d;
                if (i2 <= 0) {
                    imageView.setImageDrawable(new fxe(imageView.getContext(), c18115a.f125286a, 24.0f, t100.m186890d(24.0f)));
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.izq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f115589a.m206197C(c18115a, view);
                        }
                    });
                    return;
                }
                imageView.setImageResource(i2);
                if (TextUtils.isEmpty(c18115a.f125286a)) {
                    str = "[" + CoreModule.f17544b.getString(c18115a.f125287b) + Constants.AES_SUFFIX;
                    string = CoreModule.f17544b.getString(c18115a.f125287b);
                } else {
                    str = "[" + c18115a.f125286a + Constants.AES_SUFFIX;
                    string = c18115a.f125286a;
                }
                linearLayout.setTag(str);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.jzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f120410a.m206198D(i, c18115a, view);
                    }
                });
                linearLayout.setOnLongClickListener(new a(linearLayout, c18115a, string));
                linearLayout.setOnTouchListener(new b());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new e(wyq.this.f188592m.inflater().inflate(l6c0.f126470f3, viewGroup, false));
            }
            wyq wyqVar = wyq.this;
            if (i == 1) {
                return new c(wyqVar.f188592m.inflater().inflate(l6c0.f126456d3, viewGroup, false));
            }
            View viewInflate = wyqVar.f188592m.inflater().inflate(l6c0.f126463e3, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iM186890d = t100.m186890d(40.0f);
            int iM186890d2 = t100.m186890d(60.0f);
            layoutParams.width = iM186890d;
            layoutParams.height = iM186890d2;
            viewInflate.setLayoutParams(layoutParams);
            return new d(viewInflate);
        }
    }

    /* JADX INFO: renamed from: l.wyq$l */
    public class C21005l extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

        /* JADX INFO: renamed from: a */
        public List<Sticker> f188659a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public Act f188660b;

        /* JADX INFO: renamed from: l.wyq$l$a */
        public class a extends RecyclerView.AbstractC0566d0 {

            /* JADX INFO: renamed from: a */
            public VDraweeView f188662a;

            /* JADX INFO: renamed from: b */
            public FrameLayout f188663b;

            public a(View view) {
                super(view);
                this.f188662a = (VDraweeView) view.findViewById(y4c0.f195944C1);
                this.f188663b = (FrameLayout) view.findViewById(y4c0.f195941B5);
            }
        }

        public C21005l(Act act) {
            this.f188660b = act;
        }

        /* JADX INFO: renamed from: F */
        private PopupWindow m206206F(Context context, final Sticker sticker) {
            View viewInflate = o7r.m163037a(context).inflate(l6c0.f126503k1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196257y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            VText vText = (VText) viewInflate.findViewById(y4c0.f196101c);
            vText.getPaint().setFakeBoldText(true);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ozq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146491a.m206210G(sticker, popupWindow, view);
                }
            });
            CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
            wyq.this.m206155b0(viewInflate, vText, null);
            return popupWindow;
        }

        /* JADX INFO: renamed from: L */
        private void m206207L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM208412y0 = xdl0.m208412y0();
            int i2 = t100.f167258g;
            if (measuredWidth > iM208412y0 - i2) {
                width = (xdl0.m208412y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            contentView.getLocationInWindow(iArr);
            ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.f196143i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
            view2.getParent().requestDisallowInterceptTouchEvent(true);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.nzq
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    wyq.C21005l.m206209z(view2);
                }
            });
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m206209z(View view) {
            if (NullChecker.m81303a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m206210G(Sticker sticker, PopupWindow popupWindow, View view) {
            zvf0.m220399u("e_gif_add", OMSDialogPositon.p_chat_view, vwb.m200311Y("gift_url", sticker.pictures.get(0).url));
            popupWindow.dismiss();
            wyq.this.m206137J(sticker);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean m206211H(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.m81303a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f31862o);
            if (!NullChecker.m81303a(sticker)) {
                return true;
            }
            ((MessagesAct) this.f188660b).mo48974l().m120703R6(sticker, TextUtils.isEmpty(sticker.f56011id));
            return true;
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m206212I(FrameLayout frameLayout, View view) {
            zvf0.m220396r("e_chat_hot_gifs_search", OMSDialogPositon.p_chat_view);
            Intent intent = new Intent(frameLayout.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f31857j, true);
            intent.putExtra(CorePopularMemeAct.f31858k, true);
            String string = ((MessagesAct) this.f188660b).mo48954A0().m156457g0().m128210t0().getBar_center_text().getText().toString();
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra(CorePopularMemeAct.f31861n, string);
            }
            this.f188660b.startActivityForResult(18, intent, new C4317a.a() { // from class: l.pzq
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent2) {
                    return this.f151967a.m206211H(i, i2, intent2);
                }
            });
            this.f188660b.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m206213J(Sticker sticker, int i, View view) {
            zvf0.m220399u("e_chat_gif_click", OMSDialogPositon.p_chat_view, vwb.m200311Y("gif_source", "gifs"), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("gifs_order", (i + 1) + ""));
            if (NullChecker.m81303a(sticker)) {
                ((MessagesAct) this.f188660b).mo48974l().m120703R6(sticker, TextUtils.isEmpty(sticker.f56011id));
            }
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ boolean m206214K(Sticker sticker, FrameLayout frameLayout, View view) {
            zvf0.m220368A("e_gif_add", OMSDialogPositon.p_chat_view, vwb.m200311Y("gift_url", sticker.pictures.get(0).url));
            m206207L(m206206F(frameLayout.getContext(), sticker), frameLayout, view);
            return true;
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m206215M(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f188659a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, final int i) {
            a aVar = (a) abstractC0566d0;
            VDraweeView vDraweeView = aVar.f188662a;
            final FrameLayout frameLayout = aVar.f188663b;
            if (i == 0) {
                vDraweeView.setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78767i2 : c3c0.f78758h2);
                vDraweeView.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78561K3 : c3c0.f78552J3);
                vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                zvf0.m220402x("e_chat_hot_gifs_search", OMSDialogPositon.p_chat_view);
                xdl0.m208342L(frameLayout, new View.OnClickListener() { // from class: l.kzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f125407a.m206212I(frameLayout, view);
                    }
                });
                return;
            }
            final Sticker sticker = this.f188659a.get(i - 1);
            if (!NullChecker.m81303a(sticker) || sticker.pictures.isEmpty()) {
                qib0.f154691G.m184725o(vDraweeView);
            } else {
                frameLayout.setTag(sticker);
                vDraweeView.setBackgroundResource(0);
                if (TEnum.equals(sticker.source, "shanmeng")) {
                    qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).url);
                    sticker.hash = ogw.m164284e(sticker.pictures.get(0).url);
                } else {
                    qib0.f154691G.m102312B0(vDraweeView, m206215M(sticker.pictures.get(0)));
                }
                zvf0.m220368A("e_chat_gif_click", OMSDialogPositon.p_chat_view, vwb.m200311Y("gif_source", "gifs"), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("gifs_order", (i + 1) + ""));
                xdl0.m208342L(frameLayout, new View.OnClickListener() { // from class: l.lzq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f130669a.m206213J(sticker, i, view);
                    }
                });
                frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mzq
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f136411a.m206214K(sticker, frameLayout, view);
                    }
                });
            }
            CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = this.f188660b.inflater().inflate(l6c0.f126566t1, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(4.0f)) / 4;
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0;
            viewInflate.setLayoutParams(layoutParams);
            return new a(viewInflate);
        }
    }

    public wyq(Act act, e30<String> e30Var, e30<Sticker> e30Var2, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var, boolean z, boolean z2) {
        this.f188596q = false;
        this.f188597r = false;
        this.f188598s = new HashSet();
        this.f188601v = false;
        this.f188602w = null;
        this.f188592m = act;
        this.f188593n = e30Var2;
        this.f188587h = new ArrayList();
        m206140M(e30Var, list);
        this.f188590k = new ArrayList();
        this.f188591l = editText;
        this.f188594o = d30Var;
        this.f188596q = z;
        this.f188595p = false;
        this.f188597r = z2;
        if (!z2) {
            this.f188584e = new C21001h(e30Var, arrayList);
        } else {
            this.f188585f = new C21003j(e30Var, arrayList);
            this.f188586g = new C21005l(act);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m206131u(Sticker sticker, roj0 roj0Var) {
        if (!vwb.m200296J(sticker.pictures)) {
            qib0.f154691G.m102377x0(sticker.pictures.get(0).url);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102377x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        lsi0.m151593w(R$string.f20986h6);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.uyq
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m206133w(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            lsi0.m151593w(R$string.f20977g6);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.vyq
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19624Z.f20143T.m121236q();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m206135y(View view) {
    }

    /* JADX INFO: renamed from: J */
    public void m206137J(final Sticker sticker) {
        if (!NullChecker.m81303a(CoreModule.f17545c.f19624Z.f20143T.m121233n()) || vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers) || vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers) || CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers.size() < 300) {
            this.f188592m.duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34950O(sticker)).subscribe(mkd0.m154956H(new e30() { // from class: l.syq
                @Override // p149l.e30
                public final void call(Object obj) {
                    wyq.m206131u(sticker, (roj0) obj);
                }
            }, new e30() { // from class: l.tyq
                @Override // p149l.e30
                public final void call(Object obj) {
                    wyq.m206133w((Throwable) obj);
                }
            }));
        } else {
            lsi0.m151593w(R$string.f21031m6);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m206138K() {
        if (TextUtils.isEmpty(this.f188591l.getText())) {
            return true;
        }
        this.f188591l.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m206139L(View view, View view2) {
        if (xdl0.m208349O0(view2)) {
            xdl0.m208359W(view, -t100.m186890d(10.0f));
        } else {
            xdl0.m208359W(view, 0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m206140M(final e30<String> e30Var, List<List<String>> list) {
        this.f188588i = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.qyq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156943a.m206144Q(e30Var, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public PopupWindow m206141N(Context context, int i, String str) {
        View viewInflate = o7r.m163037a(context).inflate(l6c0.f126575u3, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196257y1);
        VText vText = (VText) viewInflate.findViewById(y4c0.f195933A4);
        VText vText2 = (VText) viewInflate.findViewById(y4c0.f196004M0);
        vText.getPaint().setFakeBoldText(true);
        m206158e0(viewInflate, null, vText);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        yt0.m215993b(str);
        if (yt0.m215993b(str)) {
            xdl0.m208344M(vText2, true);
            xdl0.m208344M(vImage, false);
            vText2.setText("[" + str + Constants.AES_SUFFIX);
        } else {
            vImage.setImageResource(i);
        }
        vText.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: O */
    public PopupWindow m206142O(Context context, int i, String str) {
        View viewInflate = o7r.m163037a(context).inflate(l6c0.f126589w3, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196257y1);
        VText vText = (VText) viewInflate.findViewById(y4c0.f195933A4);
        VText vText2 = (VText) viewInflate.findViewById(y4c0.f196004M0);
        m206157d0(viewInflate, null, vText);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        yt0.m215993b(str);
        if (yt0.m215993b(str)) {
            xdl0.m208344M(vText2, true);
            xdl0.m208344M(vImage, false);
            vText2.setText("[" + str + Constants.AES_SUFFIX);
        } else {
            vImage.setImageResource(i);
        }
        vText.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m206143P() {
        return this.f188596q;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m206144Q(e30 e30Var, List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.ryq
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new kye.C18115a((String) obj, 0, 0));
            }
        });
        this.f188588i.add(new C21001h(e30Var, arrayList));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m206145R(View view, View view2, View view3, Boolean bool) {
        if (this.f188596q) {
            return;
        }
        xdl0.m208344M(view, bool.booleanValue());
        xdl0.m208344M(view2, bool.booleanValue());
        if (!this.f188597r) {
            m206139L(view3, view2);
        } else {
            m206151X(bool.booleanValue());
            xdl0.m208359W(view3, -t100.m186890d(10.0f));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m206146S(View view) {
        if (NullChecker.m81303a(this.f188594o)) {
            this.f188594o.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m206147T() {
        if (this.f188602w == null) {
            this.f188602w = new RunnableC20998e();
        }
        e51.m114743H(this.f188592m, this.f188602w, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: U */
    public final void m206148U() {
        if (NullChecker.m81303a(this.f188602w)) {
            e51.m114745J(this.f188602w);
            this.f188602w = null;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m206149V(List<j760<StickerBundle, StickerPackage>> list) {
        if (this.f188597r) {
            this.f188585f.notifyDataSetChanged();
        }
        if (this.f188595p) {
            if (vwb.m200296J(list) || vwb.m200296J(this.f188587h)) {
                return;
            }
            j760<StickerBundle, StickerPackage> j760Var = list.get(0);
            if (NullChecker.m81303a(j760Var.f116565b) && "custom_stickers".equals(j760Var.f116565b.f20506id) && (this.f188587h.get(0) instanceof C21000g)) {
                ((C21000g) this.f188587h.get(0)).m206178K(j760Var.f116565b);
                return;
            }
            return;
        }
        if (!vwb.m200296J(list)) {
            this.f188590k.clear();
            this.f188587h.clear();
            this.f188590k.addAll(list);
        }
        for (j760<StickerBundle, StickerPackage> j760Var2 : this.f188590k) {
            if (NullChecker.m81303a(j760Var2.f116565b) && "custom_stickers".equals(j760Var2.f116565b.f20506id)) {
                this.f188587h.add(new C21000g(this.f188593n, j760Var2.f116565b, this.f188592m));
            } else {
                this.f188587h.add(new C21002i(this.f188593n, j760Var2.f116565b));
            }
        }
        notifyDataSetChanged();
        this.f188595p = true;
    }

    /* JADX INFO: renamed from: W */
    public void m206150W() {
        this.f188595p = false;
    }

    /* JADX INFO: renamed from: X */
    public final void m206151X(boolean z) {
        if (z) {
            xdl0.m208327D0(Math.max(t100.m186890d(169.0f), (xdl0.m208414z0(this.f188592m) / 7) * 3), this.f188599t);
        } else {
            xdl0.m208327D0(Math.max(t100.m186890d(72.0f), (xdl0.m208414z0(this.f188592m) / 7) * 2), this.f188599t);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m206152Y() {
        for (Object obj : this.f188598s) {
            if (obj instanceof GridView) {
                ((GridView) obj).smoothScrollToPosition(0);
            } else if (obj instanceof RecyclerView) {
                ((RecyclerView) obj).smoothScrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m206153Z(final View view, final View view2, final View view3, int i) {
        boolean z = false;
        xdl0.m208344M(view2, CoreModule.m29935P().m94658i().mo158447t1() && !this.f188596q);
        xdl0.m208344M(view3, CoreModule.m29935P().m94658i().mo158447t1() && !this.f188596q);
        if (this.f188597r) {
            boolean z2 = CoreModule.m29935P().m94658i().mo158447t1() && !this.f188596q;
            xdl0.m208321A0(this.f188592m, this.f188599t, c3c0.f78614Q2);
            m206151X(z2);
            xdl0.m208359W(view, -t100.m186890d(10.0f));
        } else {
            m206139L(view, view3);
        }
        this.f188592m.duringCreated(CoreModule.m29935P().m94658i().mo158340Z1()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.nyq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141143a.m206145R(view2, view3, view, (Boolean) obj);
            }
        }));
        xdl0.m208329E0(view3, new View.OnClickListener() { // from class: l.oyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f146339a.m206146S(view4);
            }
        });
        String string = this.f188591l.getEditableText() == null ? null : this.f188591l.getEditableText().toString();
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C21004k c21004k = new C21004k(view, view3, i);
        this.f188600u = c21004k;
        this.f188591l.addTextChangedListener(c21004k);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.pyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                wyq.m206135y(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC20997d());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m206154a0(View view, int i) {
        xdl0.m208358V(view, i);
        xdl0.m208359W(view, i);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m206155b0(View view, TextView textView, TextView textView2) {
        if (NullChecker.m81303a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m81303a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m206156c0(boolean z) {
        if (NullChecker.m81303a(this.f188589j)) {
            this.f188589j.setNestedScrollingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m206157d0(View view, TextView textView, TextView textView2) {
        if (m206143P()) {
            view.setBackgroundResource(c3c0.f78812n2);
            if (NullChecker.m81303a(textView)) {
                textView.setTextColor(Color.parseColor("#ccffffff"));
            }
            if (NullChecker.m81303a(textView2)) {
                textView2.setTextColor(Color.parseColor("#ccffffff"));
                return;
            }
            return;
        }
        view.setBackgroundResource(c3c0.f78841q4);
        if (NullChecker.m81303a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m81303a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m206158e0(View view, TextView textView, TextView textView2) {
        if (NullChecker.m81303a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m81303a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m206159f0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int i = iArr[0];
        int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iM208412y0 = xdl0.m208412y0();
        int i2 = t100.f167252a;
        if (measuredWidth > iM208412y0 - i2) {
            width = (xdl0.m208412y0() - i2) - contentView.getMeasuredWidth();
        } else if (width < i2) {
            width = i2;
        }
        contentView.getLocationInWindow(iArr);
        ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(y4c0.f196143i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (t100.f167258g + width);
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C20995b(view2));
    }

    /* JADX INFO: renamed from: g0 */
    public void m206160g0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iM208412y0 = xdl0.m208412y0();
        int i = t100.f167252a;
        if (measuredWidth > iM208412y0 - i) {
            width = (xdl0.m208412y0() - i) - contentView.getMeasuredWidth();
        } else if (width < i) {
            width = i;
        }
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C20996c(view2));
    }

    @Override // p149l.w660
    public int getCount() {
        if (this.f188597r) {
            return 3;
        }
        return this.f188590k.size() + 3;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        if (i == 0 && NullChecker.m81303a(this.f188600u)) {
            C21004k c21004k = this.f188600u;
            if (c21004k.f188658c == 0) {
                this.f188591l.removeTextChangedListener(c21004k);
            }
        }
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        if (i != 0 && i != 1 && i != 2) {
            if (this.f188597r && i == 2) {
                View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126415X1, (ViewGroup) null);
                VRecyclerView vRecyclerView = (VRecyclerView) viewInflate.findViewById(y4c0.f196064W0);
                vRecyclerView.setLayoutManager(new GridLayoutManager(this.f188592m, 4));
                vRecyclerView.setAdapter(this.f188586g);
                ((ViewPager) viewGroup).addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
                this.f188598s.add(vRecyclerView);
                return viewInflate;
            }
            GridView gridView = new GridView(viewGroup.getContext());
            gridView.setOverScrollMode(2);
            gridView.setScrollBarSize(0);
            gridView.setNumColumns(4);
            gridView.setColumnWidth(xdl0.m208412y0() / 4);
            if (this.f188597r && i == 1) {
                gridView.setClipToPadding(false);
                xdl0.m208374f0(gridView, t100.m186890d(10.0f));
                xdl0.m208370d0(gridView, t100.m186890d(2.0f));
                xdl0.m208372e0(gridView, t100.m186890d(2.0f));
            }
            gridView.setAdapter(this.f188587h.get(i - 3));
            ((ViewPager) viewGroup).addView(gridView);
            if (this.f188597r) {
                gridView.setNestedScrollingEnabled(true);
                this.f188598s.add(gridView);
            }
            return gridView;
        }
        View viewInflate2 = this.f188597r ? o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126409W1, (ViewGroup) null) : o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126553r2, (ViewGroup) null);
        int iM208412y0 = 7;
        if (this.f188597r) {
            this.f188589j = (RecyclerView) viewInflate2.findViewById(y4c0.f195986J0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f188592m, 7);
            this.f188589j.setLayoutManager(gridLayoutManager);
            gridLayoutManager.m3326v(new C20994a(7));
            this.f188585f.m206196A(this.f188589j);
            this.f188589j.setAdapter(this.f188585f);
            this.f188598s.add(this.f188589j);
        } else {
            GridView gridView2 = (GridView) viewInflate2.findViewById(y4c0.f196087a);
            gridView2.setOverScrollMode(2);
            if (i == 0) {
                m206154a0(gridView2, t100.m186890d(8.0f));
            } else {
                iM208412y0 = xdl0.m208412y0() / t100.m186890d(60.0f);
                gridView2.setColumnWidth(t100.m186890d(60.0f));
                m206154a0(gridView2, 0);
            }
            gridView2.setNumColumns(iM208412y0);
            if (i == 0) {
                gridView2.setAdapter((ListAdapter) this.f188584e);
            } else {
                gridView2.setAdapter(this.f188588i.get(i));
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        int iM208412y1 = (xdl0.m208412y0() - (iM208412y0 * t100.m186890d(60.0f))) / 2;
        marginLayoutParams.setMargins(iM208412y1, 0, iM208412y1, 0);
        ((ViewPager) viewGroup).addView(viewInflate2, marginLayoutParams);
        View viewFindViewById = viewInflate2.findViewById(y4c0.f195998L0);
        View viewFindViewById2 = viewInflate2.findViewById(y4c0.f195992K0);
        ImageView imageView = (ImageView) viewInflate2.findViewById(y4c0.f195980I0);
        this.f188599t = (FrameLayout) viewInflate2.findViewById(y4c0.f195974H0);
        if (m206143P()) {
            viewFindViewById2.setBackgroundResource(c3c0.f78803m2);
            imageView.setImageResource(c3c0.f78656V3);
        } else if (this.f188597r) {
            viewFindViewById2.setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78794l2 : c3c0.f78785k2);
            imageView.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78648U3 : c3c0.f78534H3);
        } else {
            viewFindViewById2.setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78794l2 : c3c0.f78785k2);
            imageView.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78648U3 : c3c0.f78640T3);
        }
        m206153Z(imageView, viewFindViewById, viewFindViewById2, i);
        return viewInflate2;
    }

    public wyq(Act act, e30<String> e30Var, e30<Sticker> e30Var2, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var, boolean z) {
        this.f188596q = false;
        this.f188597r = false;
        this.f188598s = new HashSet();
        this.f188601v = false;
        this.f188602w = null;
        this.f188592m = act;
        this.f188593n = e30Var2;
        this.f188584e = new C21001h(e30Var, arrayList);
        this.f188587h = new ArrayList();
        m206140M(e30Var, list);
        this.f188590k = new ArrayList();
        this.f188591l = editText;
        this.f188594o = d30Var;
        this.f188596q = z;
        this.f188595p = false;
    }

    /* JADX INFO: renamed from: l.wyq$k */
    public static class C21004k implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f188656a;

        /* JADX INFO: renamed from: b */
        public View f188657b;

        /* JADX INFO: renamed from: c */
        public int f188658c;

        public C21004k(View view, View view2, int i) {
            this.f188656a = view;
            this.f188657b = view2;
            this.f188658c = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m81303a(this.f188656a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f188656a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f188657b;
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
