package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class fma implements iam<bma> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f99736a;

    /* JADX INFO: renamed from: b */
    public VImage f99737b;

    /* JADX INFO: renamed from: c */
    public VText f99738c;

    /* JADX INFO: renamed from: d */
    public SearchView f99739d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f99740e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f99741f;

    /* JADX INFO: renamed from: g */
    public VText f99742g;

    /* JADX INFO: renamed from: h */
    public bma f99743h;

    /* JADX INFO: renamed from: i */
    public CorePopularMemeAct f99744i;

    /* JADX INFO: renamed from: j */
    public C17013d f99745j = new C17013d();

    /* JADX INFO: renamed from: k */
    public Handler f99746k = new HandlerC17010a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.fma$a */
    public class HandlerC17010a extends Handler {
        public HandlerC17010a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            String str = (String) message.obj;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            fma.this.f99743h.m105018G0(str);
        }
    }

    /* JADX INFO: renamed from: l.fma$b */
    public class C17011b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f99748a;

        public C17011b(GridLayoutManager gridLayoutManager) {
            this.f99748a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = fma.this.f99745j.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == -1) {
                return this.f99748a.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.fma$c */
    public class C17012c implements SearchView.InterfaceC0151m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f99750a;

        public C17012c(ImageView imageView) {
            this.f99750a = imageView;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: a */
        public boolean mo601a(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = str;
            fma.this.f99746k.removeMessages(1);
            fma.this.f99746k.sendMessageDelayed(messageObtain, 500L);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: b */
        public boolean mo602b(String str) {
            fma.this.f99736a.requestFocus();
            fma.this.f99744i.hideInput();
            fma.this.f99743h.m105018G0(str);
            bnl0.m105509E0(this.f99750a, new View.OnClickListener() { // from class: l.gma
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104960a.m126196d(view);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m126196d(View view) {
            fma.this.f99744i.hideInput();
            fma.this.f99739d.setQuery("", false);
            fma.this.f99745j.m126213U(false);
            boolean zM147479J = jyb.m147479J(fma.this.f99743h.m105022r0());
            fma fmaVar = fma.this;
            if (zM147479J) {
                fmaVar.f99743h.m105017F0(false);
            } else {
                fmaVar.f99745j.m126212T(fmaVar.f99743h.m105022r0());
            }
        }
    }

    /* JADX INFO: renamed from: l.fma$d */
    public class C17013d extends jic0<Sticker> {

        /* JADX INFO: renamed from: d */
        public boolean f99753d = false;

        /* JADX INFO: renamed from: c */
        public List<Sticker> f99752c = new ArrayList();

        public C17013d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: P */
        public /* synthetic */ void m126203P(final Sticker sticker, int i, View view) {
            i4g0.m138523u("e_hot_gifs_click", fma.this.f99744i.pageId(), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("gifs_order", i + ""));
            CorePopularMemeAct corePopularMemeAct = fma.this.f99744i;
            if (!corePopularMemeAct.f32711e) {
                tcz.m190559w(corePopularMemeAct, sticker, new Runnable() { // from class: l.mma
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f137545a.m126208O(sticker);
                    }
                });
                return;
            }
            Intent intent = new Intent();
            CorePopularMemeAct corePopularMemeAct2 = fma.this.f99744i;
            intent.putExtra(CorePopularMemeAct.f32710o, sticker);
            fma.this.f99744i.setResult(-1, intent);
            fma.this.f99744i.m48999H2();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f99752c.size() + 2;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157055j4, (ViewGroup) null);
            }
            if (i == -1) {
                LinearLayout linearLayout = (LinearLayout) p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157062k4, (ViewGroup) null);
                ((TextView) linearLayout.findViewById(edc0.f93213H4)).setText(q8g0.m175796b0("搜索结果由 闪萌 提供", jyb.m147507f0("闪萌"), Color.parseColor("#757575"), lyh0.m156283c(2)));
                return linearLayout;
            }
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157108r1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y0);
            }
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final Sticker sticker, int i, final int i2) {
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(edc0.f93179C1);
                if (!NullChecker.m82486a(sticker) || sticker.pictures.isEmpty()) {
                    uqb0.f180374G.m98798o(vDraweeView);
                } else {
                    frameLayout.setTag(sticker);
                    if (TEnum.equals(sticker.source, "shanmeng")) {
                        uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).url);
                        sticker.hash = niw.m163315e(sticker.pictures.get(0).url);
                    } else {
                        uqb0.f180374G.m127096B0(vDraweeView, m126214V(sticker.pictures.get(0)));
                    }
                    i4g0.m138492A("e_hot_gifs_click", fma.this.f99744i.pageId(), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("gifs_order", i2 + ""));
                    if (fma.this.f99744i.f32711e) {
                        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hma
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                return this.f110606a.m126207N(sticker, view2);
                            }
                        });
                    }
                    bnl0.m105522L(frameLayout, new View.OnClickListener() { // from class: l.ima
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f115715a.m126203P(sticker, i2, view2);
                        }
                    });
                }
                CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
                return;
            }
            if (i != -1) {
                VText vText = (VText) ((LinearLayout) view).findViewById(edc0.f93281T0);
                if (!this.f99753d) {
                    bnl0.m105524M(vText, false);
                    return;
                } else if (this.f99752c.size() == 0) {
                    bnl0.m105524M(vText, false);
                    return;
                } else {
                    bnl0.m105524M(vText, this.f99752c.size() < 50);
                    return;
                }
            }
            VText vText2 = (VText) view.findViewById(edc0.f93213H4);
            VLinear vLinear = (VLinear) view.findViewById(edc0.f93225J4);
            VText vText3 = (VText) view.findViewById(edc0.f93231K4);
            VText vText4 = (VText) view.findViewById(edc0.f93170B);
            bnl0.m105524M(vText2, this.f99752c.size() != 0);
            if (this.f99753d) {
                bnl0.m105524M(vText3, false);
                bnl0.m105524M(vText4, false);
                if (this.f99752c.size() == 0) {
                    bnl0.m105524M(vLinear, true);
                    return;
                } else {
                    bnl0.m105524M(vLinear, false);
                    return;
                }
            }
            bnl0.m105524M(vLinear, false);
            if (this.f99752c.size() != 0) {
                bnl0.m105524M(vText3, false);
                bnl0.m105524M(vText4, false);
            } else {
                bnl0.m105524M(vText3, true);
                bnl0.m105524M(vText4, true);
                bnl0.m105522L(vText4, new View.OnClickListener() { // from class: l.jma
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f121656a.m126209Q(view2);
                    }
                });
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f99752c.size() + 1 || i == 0) {
                return null;
            }
            return this.f99752c.get(i - 1);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m126206M(Sticker sticker) {
            i4g0.m138523u("e_add_hot_gif", fma.this.f99744i.pageId(), jyb.m147494Y("gift_url", sticker.pictures.get(0).url));
            fma.this.f99743h.m105020p0(sticker);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ boolean m126207N(final Sticker sticker, View view) {
            i4g0.m138492A("e_add_hot_gif", fma.this.f99744i.pageId(), jyb.m147494Y("gift_url", sticker.pictures.get(0).url));
            tcz.m190559w(fma.this.f99744i, sticker, new Runnable() { // from class: l.kma
                @Override // java.lang.Runnable
                public final void run() {
                    this.f127457a.m126206M(sticker);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m126208O(Sticker sticker) {
            fma.this.f99743h.m105020p0(sticker);
        }

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ void m126209Q(View view) {
            fma.this.f99743h.m105017F0(true);
        }

        /* JADX INFO: renamed from: R */
        public final /* synthetic */ void m126210R(View view) {
            fma.this.f99743h.m105016E0();
        }

        /* JADX INFO: renamed from: S */
        public void m126211S() {
            if (this.f99753d) {
                bnl0.m105524M(fma.this.f99741f, false);
                return;
            }
            int size = this.f99752c.size();
            fma fmaVar = fma.this;
            if (size == 0) {
                bnl0.m105524M(fmaVar.f99741f, false);
            } else {
                bnl0.m105524M(fmaVar.f99741f, true);
                bnl0.m105509E0(fma.this.f99741f, new View.OnClickListener() { // from class: l.lma
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f132655a.m126210R(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: T */
        public void m126212T(List<Sticker> list) {
            this.f99752c.clear();
            this.f99752c.addAll(list);
            m126211S();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: U */
        public void m126213U(boolean z) {
            this.f99753d = z;
        }

        /* JADX INFO: renamed from: V */
        public Picture.ImageUri m126214V(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.f99752c.size() + 1) {
                return 0;
            }
            return i == 0 ? -1 : 1;
        }
    }

    public fma(CorePopularMemeAct corePopularMemeAct) {
        this.f99744i = corePopularMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m126186i(View view) {
        this.f99744i.m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m126187j() {
        this.f99739d.clearFocus();
        this.f99744i.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m126188k() {
        this.f99739d.setQuery(this.f99744i.f32712f, false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f99744i;
    }

    /* JADX INFO: renamed from: d */
    public View m126189d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nma.m163809b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bma bmaVar) {
        this.f99743h = bmaVar;
    }

    /* JADX INFO: renamed from: f */
    public void m126191f() {
        o1j0.m165634h(R$string.f21461B2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m126189d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m126192l(List<Sticker> list) {
        this.f99745j.m126212T(list);
        this.f99745j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m */
    public void m126193m() {
        this.f99740e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: r */
    public void m126194r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f99744i, 4);
        gridLayoutManager.m3327v(new C17011b(gridLayoutManager));
        this.f99740e.setLayoutManager(gridLayoutManager);
        this.f99740e.setAdapter(this.f99745j);
        VText vText = this.f99738c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f99742g.setTypeface(typeface);
        this.f99739d.setQueryHint(this.f99744i.getString(R$string.f21706f2));
        this.f99739d.setIconifiedByDefault(false);
        this.f99739d.setBackground(this.f99744i.getDrawable(ibc0.f113847L5));
        View viewFindViewById = this.f99739d.findViewById(xdc0.f193542I);
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) this.f99739d.findViewById(xdc0.f193543J);
        bnl0.m105538V(searchAutoComplete, 0);
        qnp0.m177262e1(searchAutoComplete, tbc0.f172858H);
        ImageView imageView = (ImageView) this.f99739d.findViewById(xdc0.f193538E);
        bnl0.m105552e0(imageView, 0);
        imageView.setImageResource(ibc0.f113886Q);
        viewFindViewById.setBackgroundColor(this.f99744i.getResources().getColor(g9c0.f102807Y));
        TextView textView = (TextView) this.f99739d.findViewById(xdc0.f193543J);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setHintTextColor(Color.parseColor("#cbcbcb"));
        textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        ImageView imageView2 = (ImageView) this.f99739d.findViewById(xdc0.f193541H);
        imageView2.setImageResource(ibc0.f113895R);
        bnl0.m105538V(imageView2, 0);
        bnl0.m105539W(imageView2, 0);
        this.f99739d.setOnQueryTextListener(new C17012c(imageView));
        bnl0.m105509E0(this.f99737b, new View.OnClickListener() { // from class: l.cma
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82563a.m126186i(view);
            }
        });
        this.f99744i.postDelayed(new Runnable() { // from class: l.dma
            @Override // java.lang.Runnable
            public final void run() {
                this.f89614a.m126187j();
            }
        }, 20L);
        if (TextUtils.isEmpty(this.f99744i.f32712f)) {
            return;
        }
        this.f99744i.postDelayed(new Runnable() { // from class: l.ema
            @Override // java.lang.Runnable
            public final void run() {
                this.f94641a.m126188k();
            }
        }, 200L);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
