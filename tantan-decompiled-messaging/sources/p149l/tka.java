package p149l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class tka implements s7m<pka> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f170827a;

    /* JADX INFO: renamed from: b */
    public VImage f170828b;

    /* JADX INFO: renamed from: c */
    public VText f170829c;

    /* JADX INFO: renamed from: d */
    public SearchView f170830d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f170831e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f170832f;

    /* JADX INFO: renamed from: g */
    public VText f170833g;

    /* JADX INFO: renamed from: h */
    public pka f170834h;

    /* JADX INFO: renamed from: i */
    public CorePopularMemeAct f170835i;

    /* JADX INFO: renamed from: j */
    public C20201d f170836j = new C20201d();

    /* JADX INFO: renamed from: k */
    public Handler f170837k = new HandlerC20198a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.tka$a */
    public class HandlerC20198a extends Handler {
        public HandlerC20198a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            String str = (String) message.obj;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            tka.this.f170834h.m170009G0(str);
        }
    }

    /* JADX INFO: renamed from: l.tka$b */
    public class C20199b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f170839a;

        public C20199b(GridLayoutManager gridLayoutManager) {
            this.f170839a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = tka.this.f170836j.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == -1) {
                return this.f170839a.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.tka$c */
    public class C20200c implements SearchView.InterfaceC0150m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f170841a;

        public C20200c(ImageView imageView) {
            this.f170841a = imageView;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: a */
        public boolean mo600a(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = str;
            tka.this.f170837k.removeMessages(1);
            tka.this.f170837k.sendMessageDelayed(messageObtain, 500L);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: b */
        public boolean mo601b(String str) {
            tka.this.f170827a.requestFocus();
            tka.this.f170835i.hideInput();
            tka.this.f170834h.m170009G0(str);
            xdl0.m208329E0(this.f170841a, new View.OnClickListener() { // from class: l.uka
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176913a.m189449d(view);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m189449d(View view) {
            tka.this.f170835i.hideInput();
            tka.this.f170830d.setQuery("", false);
            tka.this.f170836j.m189466U(false);
            boolean zM200296J = vwb.m200296J(tka.this.f170834h.m170013r0());
            tka tkaVar = tka.this;
            if (zM200296J) {
                tkaVar.f170834h.m170008F0(false);
            } else {
                tkaVar.f170836j.m189465T(tkaVar.f170834h.m170013r0());
            }
        }
    }

    /* JADX INFO: renamed from: l.tka$d */
    public class C20201d extends dac0<Sticker> {

        /* JADX INFO: renamed from: d */
        public boolean f170844d = false;

        /* JADX INFO: renamed from: c */
        public List<Sticker> f170843c = new ArrayList();

        public C20201d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: P */
        public /* synthetic */ void m189456P(final Sticker sticker, int i, View view) {
            zvf0.m220399u("e_hot_gifs_click", tka.this.f170835i.pageId(), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("gifs_order", i + ""));
            CorePopularMemeAct corePopularMemeAct = tka.this.f170835i;
            if (!corePopularMemeAct.f31863e) {
                w3z.m201431w(corePopularMemeAct, sticker, new Runnable() { // from class: l.ala
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70419a.m189461O(sticker);
                    }
                });
                return;
            }
            Intent intent = new Intent();
            CorePopularMemeAct corePopularMemeAct2 = tka.this.f170835i;
            intent.putExtra(CorePopularMemeAct.f31862o, sticker);
            tka.this.f170835i.setResult(-1, intent);
            tka.this.f170835i.m47815F2();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f170843c.size() + 2;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126499j4, (ViewGroup) null);
            }
            if (i == -1) {
                LinearLayout linearLayout = (LinearLayout) o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126506k4, (ViewGroup) null);
                ((TextView) linearLayout.findViewById(y4c0.f195978H4)).setText(i0g0.m133861b0("搜索结果由 闪萌 提供", vwb.m200324f0("闪萌"), Color.parseColor("#757575"), eqh0.m117752c(2)));
                return linearLayout;
            }
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126552r1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y0);
            }
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final Sticker sticker, int i, final int i2) {
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.f195944C1);
                if (!NullChecker.m81303a(sticker) || sticker.pictures.isEmpty()) {
                    qib0.f154691G.m184725o(vDraweeView);
                } else {
                    frameLayout.setTag(sticker);
                    if (TEnum.equals(sticker.source, "shanmeng")) {
                        qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).url);
                        sticker.hash = ogw.m164284e(sticker.pictures.get(0).url);
                    } else {
                        qib0.f154691G.m102312B0(vDraweeView, m189467V(sticker.pictures.get(0)));
                    }
                    zvf0.m220368A("e_hot_gifs_click", tka.this.f170835i.pageId(), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("gifs_order", i2 + ""));
                    if (tka.this.f170835i.f31863e) {
                        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vka
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                return this.f181775a.m189460N(sticker, view2);
                            }
                        });
                    }
                    xdl0.m208342L(frameLayout, new View.OnClickListener() { // from class: l.wka
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f186735a.m189456P(sticker, i2, view2);
                        }
                    });
                }
                CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
                return;
            }
            if (i != -1) {
                VText vText = (VText) ((LinearLayout) view).findViewById(y4c0.f196046T0);
                if (!this.f170844d) {
                    xdl0.m208344M(vText, false);
                    return;
                } else if (this.f170843c.size() == 0) {
                    xdl0.m208344M(vText, false);
                    return;
                } else {
                    xdl0.m208344M(vText, this.f170843c.size() < 50);
                    return;
                }
            }
            VText vText2 = (VText) view.findViewById(y4c0.f195978H4);
            VLinear vLinear = (VLinear) view.findViewById(y4c0.f195990J4);
            VText vText3 = (VText) view.findViewById(y4c0.f195996K4);
            VText vText4 = (VText) view.findViewById(y4c0.f195935B);
            xdl0.m208344M(vText2, this.f170843c.size() != 0);
            if (this.f170844d) {
                xdl0.m208344M(vText3, false);
                xdl0.m208344M(vText4, false);
                if (this.f170843c.size() == 0) {
                    xdl0.m208344M(vLinear, true);
                    return;
                } else {
                    xdl0.m208344M(vLinear, false);
                    return;
                }
            }
            xdl0.m208344M(vLinear, false);
            if (this.f170843c.size() != 0) {
                xdl0.m208344M(vText3, false);
                xdl0.m208344M(vText4, false);
            } else {
                xdl0.m208344M(vText3, true);
                xdl0.m208344M(vText4, true);
                xdl0.m208342L(vText4, new View.OnClickListener() { // from class: l.xka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f193277a.m189462Q(view2);
                    }
                });
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f170843c.size() + 1 || i == 0) {
                return null;
            }
            return this.f170843c.get(i - 1);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m189459M(Sticker sticker) {
            zvf0.m220399u("e_add_hot_gif", tka.this.f170835i.pageId(), vwb.m200311Y("gift_url", sticker.pictures.get(0).url));
            tka.this.f170834h.m170011p0(sticker);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ boolean m189460N(final Sticker sticker, View view) {
            zvf0.m220368A("e_add_hot_gif", tka.this.f170835i.pageId(), vwb.m200311Y("gift_url", sticker.pictures.get(0).url));
            w3z.m201431w(tka.this.f170835i, sticker, new Runnable() { // from class: l.yka
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198739a.m189459M(sticker);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m189461O(Sticker sticker) {
            tka.this.f170834h.m170011p0(sticker);
        }

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ void m189462Q(View view) {
            tka.this.f170834h.m170008F0(true);
        }

        /* JADX INFO: renamed from: R */
        public final /* synthetic */ void m189463R(View view) {
            tka.this.f170834h.m170007E0();
        }

        /* JADX INFO: renamed from: S */
        public void m189464S() {
            if (this.f170844d) {
                xdl0.m208344M(tka.this.f170832f, false);
                return;
            }
            int size = this.f170843c.size();
            tka tkaVar = tka.this;
            if (size == 0) {
                xdl0.m208344M(tkaVar.f170832f, false);
            } else {
                xdl0.m208344M(tkaVar.f170832f, true);
                xdl0.m208329E0(tka.this.f170832f, new View.OnClickListener() { // from class: l.zka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f203524a.m189463R(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: T */
        public void m189465T(List<Sticker> list) {
            this.f170843c.clear();
            this.f170843c.addAll(list);
            m189464S();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: U */
        public void m189466U(boolean z) {
            this.f170844d = z;
        }

        /* JADX INFO: renamed from: V */
        public Picture.ImageUri m189467V(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.f170843c.size() + 1) {
                return 0;
            }
            return i == 0 ? -1 : 1;
        }
    }

    public tka(CorePopularMemeAct corePopularMemeAct) {
        this.f170835i = corePopularMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m189439i(View view) {
        this.f170835i.m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m189440j() {
        this.f170830d.clearFocus();
        this.f170835i.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m189441k() {
        this.f170830d.setQuery(this.f170835i.f31864f, false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f170835i;
    }

    /* JADX INFO: renamed from: d */
    public View m189442d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bla.m102512b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pka pkaVar) {
        this.f170834h = pkaVar;
    }

    /* JADX INFO: renamed from: f */
    public void m189444f() {
        lsi0.m151578h(R$string.f20719B2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m189442d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m189445l(List<Sticker> list) {
        this.f170836j.m189465T(list);
        this.f170836j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m */
    public void m189446m() {
        this.f170831e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: r */
    public void m189447r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f170835i, 4);
        gridLayoutManager.m3326v(new C20199b(gridLayoutManager));
        this.f170831e.setLayoutManager(gridLayoutManager);
        this.f170831e.setAdapter(this.f170836j);
        VText vText = this.f170829c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f170833g.setTypeface(typeface);
        this.f170830d.setQueryHint(this.f170835i.getString(R$string.f20964f2));
        this.f170830d.setIconifiedByDefault(false);
        this.f170830d.setBackground(this.f170835i.getDrawable(c3c0.f78572L5));
        View viewFindViewById = this.f170830d.findViewById(s5c0.f162503I);
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) this.f170830d.findViewById(s5c0.f162504J);
        xdl0.m208358V(searchAutoComplete, 0);
        mep0.m154303e1(searchAutoComplete, n3c0.f136943H);
        ImageView imageView = (ImageView) this.f170830d.findViewById(s5c0.f162499E);
        xdl0.m208372e0(imageView, 0);
        imageView.setImageResource(c3c0.f78611Q);
        viewFindViewById.setBackgroundColor(this.f170835i.getResources().getColor(a1c0.f67143Y));
        TextView textView = (TextView) this.f170830d.findViewById(s5c0.f162504J);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setHintTextColor(Color.parseColor("#cbcbcb"));
        textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        ImageView imageView2 = (ImageView) this.f170830d.findViewById(s5c0.f162502H);
        imageView2.setImageResource(c3c0.f78620R);
        xdl0.m208358V(imageView2, 0);
        xdl0.m208359W(imageView2, 0);
        this.f170830d.setOnQueryTextListener(new C20200c(imageView));
        xdl0.m208329E0(this.f170828b, new View.OnClickListener() { // from class: l.qka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155090a.m189439i(view);
            }
        });
        this.f170835i.postDelayed(new Runnable() { // from class: l.rka
            @Override // java.lang.Runnable
            public final void run() {
                this.f159785a.m189440j();
            }
        }, 20L);
        if (TextUtils.isEmpty(this.f170835i.f31864f)) {
            return;
        }
        this.f170835i.postDelayed(new Runnable() { // from class: l.ska
            @Override // java.lang.Runnable
            public final void run() {
                this.f164943a.m189441k();
            }
        }, 200L);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
