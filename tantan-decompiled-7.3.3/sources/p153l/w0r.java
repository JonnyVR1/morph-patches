package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMyCustomMemeAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w0r extends lb2 {

    /* JADX INFO: renamed from: e */
    public C20984h f186628e;

    /* JADX INFO: renamed from: f */
    public C20986j f186629f;

    /* JADX INFO: renamed from: g */
    public C20988l f186630g;

    /* JADX INFO: renamed from: h */
    public List<ListAdapter> f186631h;

    /* JADX INFO: renamed from: i */
    public List<ListAdapter> f186632i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f186633j;

    /* JADX INFO: renamed from: k */
    public List<pf60<StickerBundle, StickerPackage>> f186634k;

    /* JADX INFO: renamed from: l */
    public EditText f186635l;

    /* JADX INFO: renamed from: m */
    public Act f186636m;

    /* JADX INFO: renamed from: n */
    public y20<Sticker> f186637n;

    /* JADX INFO: renamed from: o */
    public x20 f186638o;

    /* JADX INFO: renamed from: p */
    public boolean f186639p;

    /* JADX INFO: renamed from: q */
    public boolean f186640q;

    /* JADX INFO: renamed from: r */
    public boolean f186641r;

    /* JADX INFO: renamed from: s */
    public Set<Object> f186642s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f186643t;

    /* JADX INFO: renamed from: u */
    public C20987k f186644u;

    /* JADX INFO: renamed from: v */
    public boolean f186645v;

    /* JADX INFO: renamed from: w */
    public Runnable f186646w;

    /* JADX INFO: renamed from: l.w0r$a */
    public class C20977a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f186647a;

        public C20977a(int i) {
            this.f186647a = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = w0r.this.f186629f.getItemViewType(i);
            if (itemViewType == 0) {
                return this.f186647a;
            }
            if (itemViewType != 1) {
                return 1;
            }
            return this.f186647a;
        }
    }

    /* JADX INFO: renamed from: l.w0r$b */
    public class C20978b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f186649a;

        public C20978b(View view) {
            this.f186649a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.m82486a(this.f186649a.getParent())) {
                this.f186649a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.w0r$c */
    public class C20979c implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f186651a;

        public C20979c(View view) {
            this.f186651a = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NullChecker.m82486a(this.f186651a.getParent())) {
                this.f186651a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.w0r$d */
    public class ViewOnTouchListenerC20980d implements View.OnTouchListener {
        public ViewOnTouchListenerC20980d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                w0r.this.f186645v = false;
                w0r.this.m204243T();
            } else if (motionEvent.getAction() == 1) {
                if (bnl0.m105528O(view, motionEvent) && !w0r.this.f186645v) {
                    w0r.this.m204234K();
                }
                w0r.this.m204244U();
            } else if (motionEvent.getAction() == 3) {
                w0r.this.m204244U();
            } else if (!bnl0.m105528O(view, motionEvent)) {
                w0r.this.m204244U();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.w0r$e */
    public class RunnableC20981e implements Runnable {
        public RunnableC20981e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0r.this.f186645v = true;
            boolean zM204234K = w0r.this.m204234K();
            if (!NullChecker.m82486a(w0r.this.f186646w) || zM204234K) {
                return;
            }
            w0r w0rVar = w0r.this;
            l51.m152888H(w0rVar.f186636m, w0rVar.f186646w, 130L);
        }
    }

    /* JADX INFO: renamed from: l.w0r$f */
    public class C20982f extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public int f186655a = (((bnl0.m105592y0() - qa00.m175859d(24.0f)) / 7) - qa00.m175859d(40.0f)) / 6;

        /* JADX INFO: renamed from: b */
        public int f186656b;

        public C20982f(int i) {
            this.f186656b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f186656b;
            if (i == 0) {
                rect.left = (childAdapterPosition % 7) * this.f186655a;
                return;
            }
            if (childAdapterPosition == 0 || childAdapterPosition == i) {
                rect.left = 0;
                return;
            }
            if (childAdapterPosition >= i) {
                childAdapterPosition -= i;
            }
            rect.left = ((childAdapterPosition - 1) % 7) * this.f186655a;
        }
    }

    /* JADX INFO: renamed from: l.w0r$g */
    public class C20983g extends dq1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f186658c;

        /* JADX INFO: renamed from: d */
        public final y20<Sticker> f186659d;

        /* JADX INFO: renamed from: e */
        public Act f186660e;

        /* JADX INFO: renamed from: f */
        public PopupWindow f186661f;

        /* JADX INFO: renamed from: l.w0r$g$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f186663a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f186664b;

            public a(View view, Sticker sticker) {
                this.f186663a = view;
                this.f186664b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C20983g c20983g = C20983g.this;
                c20983g.f186661f = c20983g.m204269F(this.f186663a.getContext(), this.f186664b);
                C20983g c20983g2 = C20983g.this;
                c20983g2.m204261L(c20983g2.f186661f, this.f186663a, view);
                return true;
            }
        }

        public C20983g(y20<Sticker> y20Var, StickerPackage stickerPackage, Act act) {
            this.f186659d = y20Var;
            if (stickerPackage == null || jyb.m147479J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f186658c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f186658c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f186658c;
            stickerPackage2.stickers = jyb.m147522n(stickerPackage2.stickers, new qcj() { // from class: l.b1r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return w0r.C20983g.m204267z((String) obj);
                }
            });
            this.f186660e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public void m204261L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM105592y0 = bnl0.m105592y0();
            int i2 = qa00.f156320g;
            if (measuredWidth > iM105592y0 - i2) {
                width = (bnl0.m105592y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            if (w0r.this.f186641r) {
                contentView.getLocationInWindow(iArr);
                ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(edc0.f93378i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.c1r
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        w0r.C20983g.m204262p(view2);
                    }
                });
            }
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m204262p(View view) {
            if (NullChecker.m82486a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: w */
        public static /* synthetic */ boolean m204265w(View view) {
            return false;
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ Boolean m204267z(String str) {
            Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(str);
            return NullChecker.m82486a(stickerM35930s3) ? Boolean.valueOf("default".equals(stickerM35930s3.status)) : Boolean.FALSE;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo21401j(final View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93179C1);
            if (i2 == 0) {
                if (w0r.this.m204239P()) {
                    vDraweeView.setImageResource(0);
                    vDraweeView.setBackgroundResource(ibc0.f113753B1);
                } else if (w0r.this.f186641r) {
                    vDraweeView.setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113997d2 : ibc0.f114033h2);
                    vDraweeView.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114015f2 : ibc0.f113818I3);
                } else {
                    vDraweeView.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114015f2 : ibc0.f114006e2);
                    vDraweeView.setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113997d2 : ibc0.f113988c2);
                }
                vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                i4g0.m138526x("e_chat_collect_gifs_operation", OMSDialogPositon.p_chat_view);
                bnl0.m105522L(linearLayout, new View.OnClickListener() { // from class: l.y0r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f197033a.m204270G(view, view2);
                    }
                });
                linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z0r
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return w0r.C20983g.m204265w(view2);
                    }
                });
                return;
            }
            final Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(str);
            if (!NullChecker.m82486a(stickerM35930s3) || stickerM35930s3.pictures.isEmpty()) {
                uqb0.f180374G.m98798o(vDraweeView);
                return;
            }
            if (w0r.this.f186641r) {
                CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
            }
            vDraweeView.setBackgroundResource(0);
            linearLayout.setTag(stickerM35930s3);
            if (w0r.this.f186641r) {
                i4g0.m138492A("e_chat_gif_click", OMSDialogPositon.p_chat_view, jyb.m147494Y("gif_source", "collect"), jyb.m147494Y("gift_url", stickerM35930s3.pictures.get(0).url), jyb.m147494Y("gifs_order", (i2 + 1) + ""));
            }
            bnl0.m105522L(linearLayout, new View.OnClickListener() { // from class: l.a1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f67830a.m204271H(stickerM35930s3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerM35930s3));
            if (TEnum.equals(stickerM35930s3.source, "shanmeng")) {
                uqb0.f180374G.m127115L0(vDraweeView, stickerM35930s3.pictures.get(0).url);
            } else {
                uqb0.f180374G.m127096B0(vDraweeView, m204275M(stickerM35930s3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: F */
        public final PopupWindow m204269F(Context context, final Sticker sticker) {
            View viewInflate = w0r.this.f186641r ? p9r.m171370a(context).inflate(qec0.f157052j1, (ViewGroup) null) : p9r.m171370a(context).inflate(qec0.f157045i1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93492y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            VText vText = (VText) viewInflate.findViewById(edc0.f93187D2);
            VText vText2 = (VText) viewInflate.findViewById(edc0.f93428p0);
            vText.getPaint().setFakeBoldText(true);
            vText2.getPaint().setFakeBoldText(true);
            i4g0.m138526x("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.d1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84710a.m204272I(sticker, popupWindow, view);
                }
            });
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.e1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91659a.m204273J(sticker, popupWindow, view);
                }
            });
            w0r w0rVar = w0r.this;
            if (!w0rVar.f186641r) {
                w0rVar.m204253d0(viewInflate, vText, vText2);
                return popupWindow;
            }
            CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
            w0r.this.m204251b0(viewInflate, vText, vText2);
            return popupWindow;
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m204270G(View view, View view2) {
            if (w0r.this.f186641r) {
                i4g0.m138520r("e_chat_collect_gifs_operation", OMSDialogPositon.p_chat_view);
            }
            view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) CoreMyCustomMemeAct.class));
            this.f186660e.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m204271H(Sticker sticker, int i, View view) {
            if (w0r.this.f186641r) {
                i4g0.m138523u("e_chat_gif_click", OMSDialogPositon.p_chat_view, jyb.m147494Y("gif_source", "collect"), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("gifs_order", (i + 1) + ""));
            } else {
                i4g0.m138523u("e_stickers", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id", this.f186658c.f21248id), jyb.m147494Y("sticker_rank", Integer.valueOf(i)));
            }
            this.f186659d.call((Sticker) view.getTag());
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m204272I(Sticker sticker, PopupWindow popupWindow, View view) {
            if (w0r.this.f186641r) {
                i4g0.m138523u("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view, jyb.m147494Y("collect_operation", StickStatus.top));
            } else {
                i4g0.m138523u("e_stickers_move_to_front", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id_new", sticker.f56859id));
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56859id);
            CoreModule.f18264c.f20366Z.f20885T.m35961W(userStickerNew_);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m204273J(Sticker sticker, PopupWindow popupWindow, View view) {
            if (w0r.this.f186641r) {
                i4g0.m138523u("e_chat_collect_gif_operation", OMSDialogPositon.p_chat_view, jyb.m147494Y("collect_operation", RequestParameters.SUBRESOURCE_DELETE));
            } else {
                i4g0.m138523u("e_stickers_delete", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id_new", sticker.f56859id));
            }
            popupWindow.dismiss();
            UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56859id);
            CoreModule.f18264c.f20366Z.f20885T.m35954P(userStickerNew_);
        }

        /* JADX INFO: renamed from: K */
        public void m204274K(StickerPackage stickerPackage) {
            if (stickerPackage == null || jyb.m147479J(stickerPackage.stickers)) {
                StickerPackage stickerPackageNew_ = StickerPackage.new_();
                this.f186658c = stickerPackageNew_;
                stickerPackageNew_.stickers = new ArrayList();
            } else {
                this.f186658c = stickerPackage;
            }
            StickerPackage stickerPackage2 = this.f186658c;
            stickerPackage2.stickers = jyb.m147522n(stickerPackage2.stickers, new qcj() { // from class: l.x0r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("default".equals(CoreModule.f18264c.f20366Z.m35930s3((String) obj).status));
                }
            });
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m204275M(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f186658c.stickers.size() + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f186658c.stickers.get(i - 1);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            View viewInflate = w0r.this.f186641r ? p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157053j2, (ViewGroup) null) : p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157102q2, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM105592y0 = w0r.this.f186641r ? (bnl0.m105592y0() - qa00.m175859d(4.0f)) / 4 : bnl0.m105592y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y0);
            }
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.w0r$h */
    public class C20984h extends dq1<oze.C19253a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<oze.C19253a> f186666c;

        /* JADX INFO: renamed from: d */
        public final y20<String> f186667d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f186668e;

        /* JADX INFO: renamed from: l.w0r$h$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f186670a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ oze.C19253a f186671b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f186672c;

            public a(View view, oze.C19253a c19253a, String str) {
                this.f186670a = view;
                this.f186671b = c19253a;
                this.f186672c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C20984h c20984h = C20984h.this;
                c20984h.f186668e = w0r.this.m204238O(this.f186670a.getContext(), this.f186671b.f149876d, this.f186672c);
                C20984h c20984h2 = C20984h.this;
                w0r.this.m204256g0(c20984h2.f186668e, this.f186670a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.w0r$h$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m82486a(C20984h.this.f186668e) || !C20984h.this.f186668e.isShowing()) {
                    return false;
                }
                C20984h.this.f186668e.dismiss();
                return false;
            }
        }

        public C20984h(y20<String> y20Var, ArrayList<oze.C19253a> arrayList) {
            this.f186666c = arrayList;
            this.f186667d = y20Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m204278w(oze.C19253a c19253a, View view) {
            this.f186667d.call(c19253a.f149873a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m204279y(View view) {
            this.f186667d.call((String) view.getTag());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f186666c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f186666c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157138v3, viewGroup, false);
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, final oze.C19253a c19253a, int i, int i2) {
            String str;
            String string;
            ImageView imageView = (ImageView) view.findViewById(edc0.f93186D1);
            if (imageView == null || c19253a == null) {
                return;
            }
            int i3 = c19253a.f149876d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new jye(imageView.getContext(), c19253a.f149873a, 24.0f, qa00.m175859d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.f1r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f96820a.m204278w(c19253a, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(c19253a.f149873a)) {
                str = "[" + CoreModule.f18263b.getString(c19253a.f149874b) + Constants.AES_SUFFIX;
                string = CoreModule.f18263b.getString(c19253a.f149874b);
            } else {
                str = "[" + c19253a.f149873a + Constants.AES_SUFFIX;
                string = c19253a.f149873a;
            }
            view.setTag(str);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.g1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f101771a.m204279y(view2);
                }
            });
            view.setOnLongClickListener(new a(view, c19253a, string));
            view.setOnTouchListener(new b());
        }
    }

    /* JADX INFO: renamed from: l.w0r$i */
    public class C20985i extends dq1<String> {

        /* JADX INFO: renamed from: c */
        public StickerPackage f186675c;

        /* JADX INFO: renamed from: d */
        public final y20<Sticker> f186676d;

        /* JADX INFO: renamed from: l.w0r$i$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f186678a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sticker f186679b;

            public a(View view, Sticker sticker) {
                this.f186678a = view;
                this.f186679b = sticker;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C20985i.this.m204281B(C20985i.this.m204285y(this.f186678a.getContext(), this.f186679b), this.f186678a);
                return true;
            }
        }

        public C20985i(y20<Sticker> y20Var, StickerPackage stickerPackage) {
            this.f186676d = y20Var;
            this.f186675c = stickerPackage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public void m204281B(PopupWindow popupWindow, View view) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM105592y0 = bnl0.m105592y0();
            int i = qa00.f156320g;
            if (measuredWidth > iM105592y0 - i) {
                width = (bnl0.m105592y0() - i) - contentView.getMeasuredWidth();
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
        public PopupWindow m204285y(Context context, Sticker sticker) {
            View viewInflate = p9r.m171370a(context).inflate(qec0.f157095p2, (ViewGroup) null);
            w0r.this.m204253d0(viewInflate, null, null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93492y1);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            return popupWindow;
        }

        /* JADX INFO: renamed from: A */
        public final void m204286A(View view, boolean z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int iM105592y0 = bnl0.m105592y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y0);
            }
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0 + (z ? qa00.m175859d(18.0f) : 0);
            view.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: C */
        public Picture.ImageUri m204287C(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f186675c.stickers.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f186675c.stickers.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157102q2, (ViewGroup) null);
            m204286A(viewInflate, false);
            return viewInflate;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, String str, int i, final int i2) {
            LinearLayout linearLayout = (LinearLayout) view;
            VDraweeView vDraweeView = (VDraweeView) linearLayout.findViewById(edc0.f93179C1);
            VText vText = (VText) linearLayout.findViewById(edc0.f93267Q4);
            final Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(str);
            if (stickerM35930s3.isChatheatSticker()) {
                bnl0.m105524M(vText, true);
                vText.setText(stickerM35930s3.name);
                m204286A(view, true);
            } else {
                bnl0.m105524M(vText, false);
                m204286A(view, false);
            }
            if (!NullChecker.m82486a(stickerM35930s3) || stickerM35930s3.pictures.isEmpty()) {
                uqb0.f180374G.m98798o(vDraweeView);
                return;
            }
            linearLayout.setTag(stickerM35930s3);
            bnl0.m105522L(linearLayout, new View.OnClickListener() { // from class: l.h1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f107475a.m204289z(stickerM35930s3, i2, view2);
                }
            });
            linearLayout.setOnLongClickListener(new a(view, stickerM35930s3));
            if (TEnum.equals(stickerM35930s3.source, "shanmeng")) {
                uqb0.f180374G.m127115L0(vDraweeView, stickerM35930s3.pictures.get(0).url);
            } else {
                uqb0.f180374G.m127096B0(vDraweeView, m204287C(stickerM35930s3.pictures.get(0)));
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m204289z(Sticker sticker, int i, View view) {
            if (TEnum.equals(sticker.source, "intimate")) {
                i4g0.m138523u("e_send_friends_emoji", OMSDialogPositon.p_chat_view, jyb.m147494Y("friends_emoji_name", sticker.name));
            } else if (TEnum.equals(sticker.source, "poke")) {
                i4g0.m138523u("e_send_chuochuo_emoji", OMSDialogPositon.p_chat_view, jyb.m147494Y("chuochuo_emoji_name", sticker.name));
            }
            i4g0.m138523u("e_stickers", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id", this.f186675c.f21248id), jyb.m147494Y("sticker_rank", Integer.valueOf(i)));
            this.f186676d.call((Sticker) view.getTag());
        }
    }

    /* JADX INFO: renamed from: l.w0r$j */
    public class C20986j extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

        /* JADX INFO: renamed from: a */
        public ArrayList<oze.C19253a> f186681a;

        /* JADX INFO: renamed from: b */
        public ArrayList<oze.C19253a> f186682b;

        /* JADX INFO: renamed from: c */
        public final y20<String> f186683c;

        /* JADX INFO: renamed from: d */
        public PopupWindow f186684d;

        /* JADX INFO: renamed from: e */
        public int f186685e = 0;

        /* JADX INFO: renamed from: f */
        public RecyclerView f186686f;

        /* JADX INFO: renamed from: l.w0r$j$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LinearLayout f186688a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ oze.C19253a f186689b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f186690c;

            public a(LinearLayout linearLayout, oze.C19253a c19253a, String str) {
                this.f186688a = linearLayout;
                this.f186689b = c19253a;
                this.f186690c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C20986j c20986j = C20986j.this;
                w0r w0rVar = w0r.this;
                boolean z = w0rVar.f186641r;
                LinearLayout linearLayout = this.f186688a;
                if (z) {
                    c20986j.f186684d = w0rVar.m204237N(linearLayout.getContext(), this.f186689b.f149876d, this.f186690c);
                    C20986j c20986j2 = C20986j.this;
                    w0r.this.m204255f0(c20986j2.f186684d, this.f186688a, view);
                    return true;
                }
                c20986j.f186684d = w0rVar.m204238O(linearLayout.getContext(), this.f186689b.f149876d, this.f186690c);
                C20986j c20986j3 = C20986j.this;
                w0r.this.m204256g0(c20986j3.f186684d, this.f186688a, view);
                return true;
            }
        }

        /* JADX INFO: renamed from: l.w0r$j$b */
        public class b implements View.OnTouchListener {
            public b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m82486a(C20986j.this.f186684d) || !C20986j.this.f186684d.isShowing()) {
                    return false;
                }
                C20986j.this.f186684d.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: l.w0r$j$c */
        public class c extends RecyclerView.AbstractC0569e0 {

            /* JADX INFO: renamed from: a */
            public TextView f186693a;

            public c(View view) {
                super(view);
                this.f186693a = (TextView) view.findViewById(edc0.f93350e);
            }
        }

        /* JADX INFO: renamed from: l.w0r$j$d */
        public class d extends RecyclerView.AbstractC0569e0 {

            /* JADX INFO: renamed from: a */
            public ImageView f186695a;

            /* JADX INFO: renamed from: b */
            public LinearLayout f186696b;

            public d(View view) {
                super(view);
                this.f186695a = (ImageView) view.findViewById(edc0.f93186D1);
                this.f186696b = (LinearLayout) view.findViewById(edc0.f93287U0);
            }
        }

        /* JADX INFO: renamed from: l.w0r$j$e */
        public class e extends RecyclerView.AbstractC0569e0 {

            /* JADX INFO: renamed from: a */
            public TextView f186698a;

            public e(View view) {
                super(view);
                this.f186698a = (TextView) view.findViewById(edc0.f93212H3);
            }
        }

        public C20986j(y20<String> y20Var, ArrayList<oze.C19253a> arrayList) {
            this.f186681a = arrayList;
            this.f186682b = arrayList;
            m204296F();
            this.f186683c = y20Var;
            m204297G();
        }

        /* JADX INFO: renamed from: A */
        public void m204292A(RecyclerView recyclerView) {
            this.f186686f = recyclerView;
            m204295E(recyclerView);
            recyclerView.addItemDecoration(w0r.this.new C20982f(this.f186685e));
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m204293C(oze.C19253a c19253a, View view) {
            this.f186683c.call(c19253a.f149873a);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m204294D(int i, oze.C19253a c19253a, View view) {
            i4g0.m138523u("e_chat_emoji_click", OMSDialogPositon.p_chat_view, jyb.m147494Y("chat_emoji_type", i < this.f186685e ? "rencent" : "all"));
            if (((MessagesAct) w0r.this.f186636m).m50140C2()) {
                tye.m193572c().m193583l(c19253a.f149877e);
                this.f186682b = tye.m193572c().m193575a();
            }
            this.f186683c.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: E */
        public final void m204295E(RecyclerView recyclerView) {
            if (NullChecker.m82486a(recyclerView)) {
                for (int itemDecorationCount = this.f186686f.getItemDecorationCount(); itemDecorationCount > 0; itemDecorationCount--) {
                    this.f186686f.removeItemDecorationAt(0);
                }
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m204296F() {
            this.f186685e = 0;
            if (this.f186681a.size() > oze.f149866d.size()) {
                for (int i = 0; i <= this.f186681a.size(); i++) {
                    if (TextUtils.equals(this.f186681a.get(i).f149877e, "all_text_tag_type")) {
                        this.f186685e = i;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m204297G() {
            i4g0.m138526x("e_chat_emoji_click", OMSDialogPositon.p_chat_view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f186681a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (TextUtils.equals(this.f186681a.get(i).f149877e, "recently_text_tag_type")) {
                return 0;
            }
            return TextUtils.equals(this.f186681a.get(i).f149877e, "all_text_tag_type") ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, final int i) {
            String str;
            String string;
            if (abstractC0569e0 instanceof d) {
                d dVar = (d) abstractC0569e0;
                ImageView imageView = dVar.f186695a;
                LinearLayout linearLayout = dVar.f186696b;
                final oze.C19253a c19253a = this.f186681a.get(i);
                int i2 = c19253a.f149876d;
                if (i2 <= 0) {
                    imageView.setImageDrawable(new jye(imageView.getContext(), c19253a.f149873a, 24.0f, qa00.m175859d(24.0f)));
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.i1r
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f112546a.m204293C(c19253a, view);
                        }
                    });
                    return;
                }
                imageView.setImageResource(i2);
                if (TextUtils.isEmpty(c19253a.f149873a)) {
                    str = "[" + CoreModule.f18263b.getString(c19253a.f149874b) + Constants.AES_SUFFIX;
                    string = CoreModule.f18263b.getString(c19253a.f149874b);
                } else {
                    str = "[" + c19253a.f149873a + Constants.AES_SUFFIX;
                    string = c19253a.f149873a;
                }
                linearLayout.setTag(str);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.j1r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f117987a.m204294D(i, c19253a, view);
                    }
                });
                linearLayout.setOnLongClickListener(new a(linearLayout, c19253a, string));
                linearLayout.setOnTouchListener(new b());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new e(w0r.this.f186636m.inflater().inflate(qec0.f157026f3, viewGroup, false));
            }
            w0r w0rVar = w0r.this;
            if (i == 1) {
                return new c(w0rVar.f186636m.inflater().inflate(qec0.f157012d3, viewGroup, false));
            }
            View viewInflate = w0rVar.f186636m.inflater().inflate(qec0.f157019e3, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iM175859d = qa00.m175859d(40.0f);
            int iM175859d2 = qa00.m175859d(60.0f);
            layoutParams.width = iM175859d;
            layoutParams.height = iM175859d2;
            viewInflate.setLayoutParams(layoutParams);
            return new d(viewInflate);
        }
    }

    /* JADX INFO: renamed from: l.w0r$l */
    public class C20988l extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

        /* JADX INFO: renamed from: a */
        public List<Sticker> f186703a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public Act f186704b;

        /* JADX INFO: renamed from: l.w0r$l$a */
        public class a extends RecyclerView.AbstractC0569e0 {

            /* JADX INFO: renamed from: a */
            public VDraweeView f186706a;

            /* JADX INFO: renamed from: b */
            public FrameLayout f186707b;

            public a(View view) {
                super(view);
                this.f186706a = (VDraweeView) view.findViewById(edc0.f93179C1);
                this.f186707b = (FrameLayout) view.findViewById(edc0.f93176B5);
            }
        }

        public C20988l(Act act) {
            this.f186704b = act;
        }

        /* JADX INFO: renamed from: F */
        private PopupWindow m204302F(Context context, final Sticker sticker) {
            View viewInflate = p9r.m171370a(context).inflate(qec0.f157059k1, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93492y1);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
            }
            VText vText = (VText) viewInflate.findViewById(edc0.f93336c);
            vText.getPaint().setFakeBoldText(true);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.o1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144682a.m204306G(sticker, popupWindow, view);
                }
            });
            CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
            w0r.this.m204251b0(viewInflate, vText, null);
            return popupWindow;
        }

        /* JADX INFO: renamed from: L */
        private void m204303L(PopupWindow popupWindow, View view, final View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int i = iArr[0];
            int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM105592y0 = bnl0.m105592y0();
            int i2 = qa00.f156320g;
            if (measuredWidth > iM105592y0 - i2) {
                width = (bnl0.m105592y0() - i2) - contentView.getMeasuredWidth();
            } else if (width < i2) {
                width = i2;
            }
            contentView.getLocationInWindow(iArr);
            ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(edc0.f93378i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (i2 + width);
            view2.getParent().requestDisallowInterceptTouchEvent(true);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.n1r
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    w0r.C20988l.m204305z(view2);
                }
            });
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m204305z(View view) {
            if (NullChecker.m82486a(view.getParent())) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m204306G(Sticker sticker, PopupWindow popupWindow, View view) {
            i4g0.m138523u("e_gif_add", OMSDialogPositon.p_chat_view, jyb.m147494Y("gift_url", sticker.pictures.get(0).url));
            popupWindow.dismiss();
            w0r.this.m204233J(sticker);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean m204307H(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.m82486a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f32710o);
            if (!NullChecker.m82486a(sticker)) {
                return true;
            }
            ((MessagesAct) this.f186704b).mo50158l().m110909R6(sticker, TextUtils.isEmpty(sticker.f56859id));
            return true;
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m204308I(FrameLayout frameLayout, View view) {
            i4g0.m138520r("e_chat_hot_gifs_search", OMSDialogPositon.p_chat_view);
            Intent intent = new Intent(frameLayout.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f32705j, true);
            intent.putExtra(CorePopularMemeAct.f32706k, true);
            String string = ((MessagesAct) this.f186704b).mo50138B0().m143374g0().m114041t0().getBar_center_text().getText().toString();
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra(CorePopularMemeAct.f32709n, string);
            }
            this.f186704b.startActivityForResult(18, intent, new C4468a.a() { // from class: l.p1r
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent2) {
                    return this.f150192a.m204307H(i, i2, intent2);
                }
            });
            this.f186704b.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m204309J(Sticker sticker, int i, View view) {
            i4g0.m138523u("e_chat_gif_click", OMSDialogPositon.p_chat_view, jyb.m147494Y("gif_source", "gifs"), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("gifs_order", (i + 1) + ""));
            if (NullChecker.m82486a(sticker)) {
                ((MessagesAct) this.f186704b).mo50158l().m110909R6(sticker, TextUtils.isEmpty(sticker.f56859id));
            }
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ boolean m204310K(Sticker sticker, FrameLayout frameLayout, View view) {
            i4g0.m138492A("e_gif_add", OMSDialogPositon.p_chat_view, jyb.m147494Y("gift_url", sticker.pictures.get(0).url));
            m204303L(m204302F(frameLayout.getContext(), sticker), frameLayout, view);
            return true;
        }

        /* JADX INFO: renamed from: M */
        public Picture.ImageUri m204311M(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f186703a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, final int i) {
            a aVar = (a) abstractC0569e0;
            VDraweeView vDraweeView = aVar.f186706a;
            final FrameLayout frameLayout = aVar.f186707b;
            if (i == 0) {
                vDraweeView.setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114042i2 : ibc0.f114033h2);
                vDraweeView.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113836K3 : ibc0.f113827J3);
                vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
                i4g0.m138526x("e_chat_hot_gifs_search", OMSDialogPositon.p_chat_view);
                bnl0.m105522L(frameLayout, new View.OnClickListener() { // from class: l.k1r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123537a.m204308I(frameLayout, view);
                    }
                });
                return;
            }
            final Sticker sticker = this.f186703a.get(i - 1);
            if (!NullChecker.m82486a(sticker) || sticker.pictures.isEmpty()) {
                uqb0.f180374G.m98798o(vDraweeView);
            } else {
                frameLayout.setTag(sticker);
                vDraweeView.setBackgroundResource(0);
                if (TEnum.equals(sticker.source, "shanmeng")) {
                    uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).url);
                    sticker.hash = niw.m163315e(sticker.pictures.get(0).url);
                } else {
                    uqb0.f180374G.m127096B0(vDraweeView, m204311M(sticker.pictures.get(0)));
                }
                i4g0.m138492A("e_chat_gif_click", OMSDialogPositon.p_chat_view, jyb.m147494Y("gif_source", "gifs"), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("gifs_order", (i + 1) + ""));
                bnl0.m105522L(frameLayout, new View.OnClickListener() { // from class: l.l1r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f129711a.m204309J(sticker, i, view);
                    }
                });
                frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.m1r
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f134458a.m204310K(sticker, frameLayout, view);
                    }
                });
            }
            CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = this.f186704b.inflater().inflate(qec0.f157122t1, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.height = -1;
            int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(4.0f)) / 4;
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0;
            viewInflate.setLayoutParams(layoutParams);
            return new a(viewInflate);
        }
    }

    public w0r(Act act, y20<String> y20Var, y20<Sticker> y20Var2, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var, boolean z, boolean z2) {
        this.f186640q = false;
        this.f186641r = false;
        this.f186642s = new HashSet();
        this.f186645v = false;
        this.f186646w = null;
        this.f186636m = act;
        this.f186637n = y20Var2;
        this.f186631h = new ArrayList();
        m204236M(y20Var, list);
        this.f186634k = new ArrayList();
        this.f186635l = editText;
        this.f186638o = x20Var;
        this.f186640q = z;
        this.f186639p = false;
        this.f186641r = z2;
        if (!z2) {
            this.f186628e = new C20984h(y20Var, arrayList);
        } else {
            this.f186629f = new C20986j(y20Var, arrayList);
            this.f186630g = new C20988l(act);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m204227u(Sticker sticker, uxj0 uxj0Var) {
        if (!jyb.m147479J(sticker.pictures)) {
            uqb0.f180374G.m127160x0(sticker.pictures.get(0).url);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127160x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        o1j0.m165649w(R$string.f21728h6);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.u0r
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m204229w(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            o1j0.m165649w(R$string.f21719g6);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.v0r
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20366Z.f20885T.m159280q();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m204231y(View view) {
    }

    /* JADX INFO: renamed from: J */
    public void m204233J(final Sticker sticker) {
        if (!NullChecker.m82486a(CoreModule.f18264c.f20366Z.f20885T.m159277n()) || jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers) || jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers) || CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers.size() < 300) {
            this.f186636m.duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35953O(sticker)).subscribe(psd0.m173597H(new y20() { // from class: l.s0r
                @Override // p153l.y20
                public final void call(Object obj) {
                    w0r.m204227u(sticker, (uxj0) obj);
                }
            }, new y20() { // from class: l.t0r
                @Override // p153l.y20
                public final void call(Object obj) {
                    w0r.m204229w((Throwable) obj);
                }
            }));
        } else {
            o1j0.m165649w(R$string.f21773m6);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m204234K() {
        if (TextUtils.isEmpty(this.f186635l.getText())) {
            return true;
        }
        this.f186635l.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m204235L(View view, View view2) {
        if (bnl0.m105529O0(view2)) {
            bnl0.m105539W(view, -qa00.m175859d(10.0f));
        } else {
            bnl0.m105539W(view, 0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m204236M(final y20<String> y20Var, List<List<String>> list) {
        this.f186632i = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.q0r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155077a.m204240Q(y20Var, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public PopupWindow m204237N(Context context, int i, String str) {
        View viewInflate = p9r.m171370a(context).inflate(qec0.f157131u3, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(edc0.f93492y1);
        VText vText = (VText) viewInflate.findViewById(edc0.f93168A4);
        VText vText2 = (VText) viewInflate.findViewById(edc0.f93239M0);
        vText.getPaint().setFakeBoldText(true);
        m204254e0(viewInflate, null, vText);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        eu0.m122519b(str);
        if (eu0.m122519b(str)) {
            bnl0.m105524M(vText2, true);
            bnl0.m105524M(vImage, false);
            vText2.setText("[" + str + Constants.AES_SUFFIX);
        } else {
            vImage.setImageResource(i);
        }
        vText.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: O */
    public PopupWindow m204238O(Context context, int i, String str) {
        View viewInflate = p9r.m171370a(context).inflate(qec0.f157145w3, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(edc0.f93492y1);
        VText vText = (VText) viewInflate.findViewById(edc0.f93168A4);
        VText vText2 = (VText) viewInflate.findViewById(edc0.f93239M0);
        m204253d0(viewInflate, null, vText);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        eu0.m122519b(str);
        if (eu0.m122519b(str)) {
            bnl0.m105524M(vText2, true);
            bnl0.m105524M(vImage, false);
            vText2.setText("[" + str + Constants.AES_SUFFIX);
        } else {
            vImage.setImageResource(i);
        }
        vText.setText(str);
        return popupWindow;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m204239P() {
        return this.f186640q;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m204240Q(y20 y20Var, List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.r0r
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new oze.C19253a((String) obj, 0, 0));
            }
        });
        this.f186632i.add(new C20984h(y20Var, arrayList));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m204241R(View view, View view2, View view3, Boolean bool) {
        if (this.f186640q) {
            return;
        }
        bnl0.m105524M(view, bool.booleanValue());
        bnl0.m105524M(view2, bool.booleanValue());
        if (!this.f186641r) {
            m204235L(view3, view2);
        } else {
            m204247X(bool.booleanValue());
            bnl0.m105539W(view3, -qa00.m175859d(10.0f));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m204242S(View view) {
        if (NullChecker.m82486a(this.f186638o)) {
            this.f186638o.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m204243T() {
        if (this.f186646w == null) {
            this.f186646w = new RunnableC20981e();
        }
        l51.m152888H(this.f186636m, this.f186646w, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: U */
    public final void m204244U() {
        if (NullChecker.m82486a(this.f186646w)) {
            l51.m152890J(this.f186646w);
            this.f186646w = null;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m204245V(List<pf60<StickerBundle, StickerPackage>> list) {
        if (this.f186641r) {
            this.f186629f.notifyDataSetChanged();
        }
        if (this.f186639p) {
            if (jyb.m147479J(list) || jyb.m147479J(this.f186631h)) {
                return;
            }
            pf60<StickerBundle, StickerPackage> pf60Var = list.get(0);
            if (NullChecker.m82486a(pf60Var.f152157b) && "custom_stickers".equals(pf60Var.f152157b.f21248id) && (this.f186631h.get(0) instanceof C20983g)) {
                ((C20983g) this.f186631h.get(0)).m204274K(pf60Var.f152157b);
                return;
            }
            return;
        }
        if (!jyb.m147479J(list)) {
            this.f186634k.clear();
            this.f186631h.clear();
            this.f186634k.addAll(list);
        }
        for (pf60<StickerBundle, StickerPackage> pf60Var2 : this.f186634k) {
            if (NullChecker.m82486a(pf60Var2.f152157b) && "custom_stickers".equals(pf60Var2.f152157b.f21248id)) {
                this.f186631h.add(new C20983g(this.f186637n, pf60Var2.f152157b, this.f186636m));
            } else {
                this.f186631h.add(new C20985i(this.f186637n, pf60Var2.f152157b));
            }
        }
        notifyDataSetChanged();
        this.f186639p = true;
    }

    /* JADX INFO: renamed from: W */
    public void m204246W() {
        this.f186639p = false;
    }

    /* JADX INFO: renamed from: X */
    public final void m204247X(boolean z) {
        if (z) {
            bnl0.m105507D0(Math.max(qa00.m175859d(169.0f), (bnl0.m105594z0(this.f186636m) / 7) * 3), this.f186643t);
        } else {
            bnl0.m105507D0(Math.max(qa00.m175859d(72.0f), (bnl0.m105594z0(this.f186636m) / 7) * 2), this.f186643t);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m204248Y() {
        for (Object obj : this.f186642s) {
            if (obj instanceof GridView) {
                ((GridView) obj).smoothScrollToPosition(0);
            } else if (obj instanceof RecyclerView) {
                ((RecyclerView) obj).smoothScrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m204249Z(final View view, final View view2, final View view3, int i) {
        boolean z = false;
        bnl0.m105524M(view2, CoreModule.m30933P().m143412i().mo180539t1() && !this.f186640q);
        bnl0.m105524M(view3, CoreModule.m30933P().m143412i().mo180539t1() && !this.f186640q);
        if (this.f186641r) {
            boolean z2 = CoreModule.m30933P().m143412i().mo180539t1() && !this.f186640q;
            bnl0.m105501A0(this.f186636m, this.f186643t, ibc0.f113889Q2);
            m204247X(z2);
            bnl0.m105539W(view, -qa00.m175859d(10.0f));
        } else {
            m204235L(view, view3);
        }
        this.f186636m.duringCreated(CoreModule.m30933P().m143412i().mo180432Z1()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.n0r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139645a.m204241R(view2, view3, view, (Boolean) obj);
            }
        }));
        bnl0.m105509E0(view3, new View.OnClickListener() { // from class: l.o0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f144566a.m204242S(view4);
            }
        });
        String string = this.f186635l.getEditableText() == null ? null : this.f186635l.getEditableText().toString();
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C20987k c20987k = new C20987k(view, view3, i);
        this.f186644u = c20987k;
        this.f186635l.addTextChangedListener(c20987k);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.p0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                w0r.m204231y(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC20980d());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m204250a0(View view, int i) {
        bnl0.m105538V(view, i);
        bnl0.m105539W(view, i);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m204251b0(View view, TextView textView, TextView textView2) {
        if (NullChecker.m82486a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m82486a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m204252c0(boolean z) {
        if (NullChecker.m82486a(this.f186633j)) {
            this.f186633j.setNestedScrollingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m204253d0(View view, TextView textView, TextView textView2) {
        if (m204239P()) {
            view.setBackgroundResource(ibc0.f114087n2);
            if (NullChecker.m82486a(textView)) {
                textView.setTextColor(Color.parseColor("#ccffffff"));
            }
            if (NullChecker.m82486a(textView2)) {
                textView2.setTextColor(Color.parseColor("#ccffffff"));
                return;
            }
            return;
        }
        view.setBackgroundResource(ibc0.f114116q4);
        if (NullChecker.m82486a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m82486a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m204254e0(View view, TextView textView, TextView textView2) {
        if (NullChecker.m82486a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m82486a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m204255f0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int i = iArr[0];
        int width = ((view.getWidth() / 2) + i) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iM105592y0 = bnl0.m105592y0();
        int i2 = qa00.f156314a;
        if (measuredWidth > iM105592y0 - i2) {
            width = (bnl0.m105592y0() - i2) - contentView.getMeasuredWidth();
        } else if (width < i2) {
            width = i2;
        }
        contentView.getLocationInWindow(iArr);
        ((RelativeLayout.LayoutParams) ((FrameLayout) contentView.findViewById(edc0.f93378i)).getLayoutParams()).leftMargin = (i + (view.getWidth() / 2)) - (qa00.f156320g + width);
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C20978b(view2));
    }

    /* JADX INFO: renamed from: g0 */
    public void m204256g0(PopupWindow popupWindow, View view, View view2) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
        int measuredWidth = contentView.getMeasuredWidth() + width;
        int iM105592y0 = bnl0.m105592y0();
        int i = qa00.f156314a;
        if (measuredWidth > iM105592y0 - i) {
            width = (bnl0.m105592y0() - i) - contentView.getMeasuredWidth();
        } else if (width < i) {
            width = i;
        }
        popupWindow.showAtLocation(view, 51, width, measuredHeight);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
        view2.getParent().requestDisallowInterceptTouchEvent(true);
        popupWindow.setOnDismissListener(new C20979c(view2));
    }

    @Override // p153l.cf60
    public int getCount() {
        if (this.f186641r) {
            return 3;
        }
        return this.f186634k.size() + 3;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        if (i == 0 && NullChecker.m82486a(this.f186644u)) {
            C20987k c20987k = this.f186644u;
            if (c20987k.f186702c == 0) {
                this.f186635l.removeTextChangedListener(c20987k);
            }
        }
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        if (i != 0 && i != 1 && i != 2) {
            if (this.f186641r && i == 2) {
                View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156971X1, (ViewGroup) null);
                VRecyclerView vRecyclerView = (VRecyclerView) viewInflate.findViewById(edc0.f93299W0);
                vRecyclerView.setLayoutManager(new GridLayoutManager(this.f186636m, 4));
                vRecyclerView.setAdapter(this.f186630g);
                ((ViewPager) viewGroup).addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
                this.f186642s.add(vRecyclerView);
                return viewInflate;
            }
            GridView gridView = new GridView(viewGroup.getContext());
            gridView.setOverScrollMode(2);
            gridView.setScrollBarSize(0);
            gridView.setNumColumns(4);
            gridView.setColumnWidth(bnl0.m105592y0() / 4);
            if (this.f186641r && i == 1) {
                gridView.setClipToPadding(false);
                bnl0.m105554f0(gridView, qa00.m175859d(10.0f));
                bnl0.m105550d0(gridView, qa00.m175859d(2.0f));
                bnl0.m105552e0(gridView, qa00.m175859d(2.0f));
            }
            gridView.setAdapter(this.f186631h.get(i - 3));
            ((ViewPager) viewGroup).addView(gridView);
            if (this.f186641r) {
                gridView.setNestedScrollingEnabled(true);
                this.f186642s.add(gridView);
            }
            return gridView;
        }
        View viewInflate2 = this.f186641r ? p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156965W1, (ViewGroup) null) : p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157109r2, (ViewGroup) null);
        int iM105592y0 = 7;
        if (this.f186641r) {
            this.f186633j = (RecyclerView) viewInflate2.findViewById(edc0.f93221J0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f186636m, 7);
            this.f186633j.setLayoutManager(gridLayoutManager);
            gridLayoutManager.m3327v(new C20977a(7));
            this.f186629f.m204292A(this.f186633j);
            this.f186633j.setAdapter(this.f186629f);
            this.f186642s.add(this.f186633j);
        } else {
            GridView gridView2 = (GridView) viewInflate2.findViewById(edc0.f93322a);
            gridView2.setOverScrollMode(2);
            if (i == 0) {
                m204250a0(gridView2, qa00.m175859d(8.0f));
            } else {
                iM105592y0 = bnl0.m105592y0() / qa00.m175859d(60.0f);
                gridView2.setColumnWidth(qa00.m175859d(60.0f));
                m204250a0(gridView2, 0);
            }
            gridView2.setNumColumns(iM105592y0);
            if (i == 0) {
                gridView2.setAdapter((ListAdapter) this.f186628e);
            } else {
                gridView2.setAdapter(this.f186632i.get(i));
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        int iM105592y1 = (bnl0.m105592y0() - (iM105592y0 * qa00.m175859d(60.0f))) / 2;
        marginLayoutParams.setMargins(iM105592y1, 0, iM105592y1, 0);
        ((ViewPager) viewGroup).addView(viewInflate2, marginLayoutParams);
        View viewFindViewById = viewInflate2.findViewById(edc0.f93233L0);
        View viewFindViewById2 = viewInflate2.findViewById(edc0.f93227K0);
        ImageView imageView = (ImageView) viewInflate2.findViewById(edc0.f93215I0);
        this.f186643t = (FrameLayout) viewInflate2.findViewById(edc0.f93209H0);
        if (m204239P()) {
            viewFindViewById2.setBackgroundResource(ibc0.f114078m2);
            imageView.setImageResource(ibc0.f113931V3);
        } else if (this.f186641r) {
            viewFindViewById2.setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114069l2 : ibc0.f114060k2);
            imageView.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113923U3 : ibc0.f113809H3);
        } else {
            viewFindViewById2.setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114069l2 : ibc0.f114060k2);
            imageView.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113923U3 : ibc0.f113915T3);
        }
        m204249Z(imageView, viewFindViewById, viewFindViewById2, i);
        return viewInflate2;
    }

    public w0r(Act act, y20<String> y20Var, y20<Sticker> y20Var2, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var, boolean z) {
        this.f186640q = false;
        this.f186641r = false;
        this.f186642s = new HashSet();
        this.f186645v = false;
        this.f186646w = null;
        this.f186636m = act;
        this.f186637n = y20Var2;
        this.f186628e = new C20984h(y20Var, arrayList);
        this.f186631h = new ArrayList();
        m204236M(y20Var, list);
        this.f186634k = new ArrayList();
        this.f186635l = editText;
        this.f186638o = x20Var;
        this.f186640q = z;
        this.f186639p = false;
    }

    /* JADX INFO: renamed from: l.w0r$k */
    public static class C20987k implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f186700a;

        /* JADX INFO: renamed from: b */
        public View f186701b;

        /* JADX INFO: renamed from: c */
        public int f186702c;

        public C20987k(View view, View view2, int i) {
            this.f186700a = view;
            this.f186701b = view2;
            this.f186702c = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m82486a(this.f186700a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f186700a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f186701b;
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
