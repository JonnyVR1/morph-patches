package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.a1c0;
import l.bla;
import l.c3c0;
import l.i0g0;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.n3c0;
import l.o7r;
import l.ogw;
import l.qib0;
import l.s5c0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tka implements s7m<pka> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f7533a;

    /* JADX INFO: renamed from: b */
    public VImage f7534b;

    /* JADX INFO: renamed from: c */
    public VText f7535c;

    /* JADX INFO: renamed from: d */
    public SearchView f7536d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f7537e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7538f;

    /* JADX INFO: renamed from: g */
    public VText f7539g;

    /* JADX INFO: renamed from: h */
    public pka f7540h;

    /* JADX INFO: renamed from: i */
    public CorePopularMemeAct f7541i;

    /* JADX INFO: renamed from: j */
    public C0556d f7542j = new C0556d();

    /* JADX INFO: renamed from: k */
    public Handler f7543k = new HandlerC0553a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.tka$a */
    public class HandlerC0553a extends Handler {
        public HandlerC0553a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            String str = (String) message.obj;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            tka.this.f7540h.m6878G0(str);
        }
    }

    /* JADX INFO: renamed from: l.tka$b */
    public class C0554b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f7545a;

        public C0554b(GridLayoutManager gridLayoutManager) {
            this.f7545a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m7780f(int i) {
            int itemViewType = tka.this.f7542j.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == -1) {
                return this.f7545a.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.tka$c */
    public class C0555c implements SearchView.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f7547a;

        public C0555c(ImageView imageView) {
            this.f7547a = imageView;
        }

        /* JADX INFO: renamed from: a */
        public boolean m7782a(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = str;
            tka.this.f7543k.removeMessages(1);
            tka.this.f7543k.sendMessageDelayed(messageObtain, 500L);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m7783b(String str) {
            tka.this.f7533a.requestFocus();
            tka.this.f7541i.hideInput();
            tka.this.f7540h.m6878G0(str);
            xdl0.E0(this.f7547a, new View.OnClickListener() { // from class: l.uka
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8004a.m7784d(view);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m7784d(View view) {
            tka.this.f7541i.hideInput();
            tka.this.f7536d.setQuery("", false);
            tka.this.f7542j.m7801U(false);
            boolean zJ = vwb.J(tka.this.f7540h.m6883r0());
            tka tkaVar = tka.this;
            if (zJ) {
                tkaVar.f7540h.m6877F0(false);
            } else {
                tkaVar.f7542j.m7800T(tkaVar.f7540h.m6883r0());
            }
        }
    }

    /* JADX INFO: renamed from: l.tka$d */
    public class C0556d extends dac0<Sticker> {

        /* JADX INFO: renamed from: d */
        public boolean f7550d = false;

        /* JADX INFO: renamed from: c */
        public List<Sticker> f7549c = new ArrayList();

        public C0556d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: P */
        public /* synthetic */ void m7791P(final Sticker sticker, int i, View view) {
            zvf0.u("e_hot_gifs_click", tka.this.f7541i.pageId(), new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("gifs_order", i + "")});
            CorePopularMemeAct corePopularMemeAct = tka.this.f7541i;
            if (!corePopularMemeAct.f1754e) {
                w3z.m8465w(corePopularMemeAct, sticker, new Runnable() { // from class: l.ala
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2233a.m7796O(sticker);
                    }
                });
                return;
            }
            Intent intent = new Intent();
            CorePopularMemeAct corePopularMemeAct2 = tka.this.f7541i;
            intent.putExtra(CorePopularMemeAct.f1753o, (Serializable) sticker);
            tka.this.f7541i.setResult(-1, intent);
            tka.this.f7541i.finish();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f7549c.size() + 2;
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return o7r.a(viewGroup.getContext()).inflate(l6c0.j4, (ViewGroup) null);
            }
            if (i == -1) {
                LinearLayout linearLayout = (LinearLayout) o7r.a(viewGroup.getContext()).inflate(l6c0.k4, (ViewGroup) null);
                ((TextView) linearLayout.findViewById(y4c0.H4)).setText(i0g0.b0("搜索结果由 闪萌 提供", vwb.f0(new String[]{"闪萌"}), Color.parseColor("#757575"), eqh0.m3924c(2)));
                return linearLayout;
            }
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.r1, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iY0 = (xdl0.y0() - t100.d(24.0f)) / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY0);
            }
            layoutParams.width = iY0;
            layoutParams.height = iY0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final Sticker sticker, int i, final int i2) {
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                SimpleDraweeView simpleDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.C1);
                if (!NullChecker.a(sticker) || sticker.pictures.isEmpty()) {
                    qib0.G.o(simpleDraweeView);
                } else {
                    frameLayout.setTag(sticker);
                    if (TEnum.equals(sticker.source, "shanmeng")) {
                        qib0.G.L0(simpleDraweeView, ((Media) ((Picture) sticker.pictures.get(0))).url);
                        sticker.hash = ogw.e(((Media) ((Picture) sticker.pictures.get(0))).url);
                    } else {
                        qib0.G.B0(simpleDraweeView, m7802V((Picture) sticker.pictures.get(0)));
                    }
                    zvf0.A("e_hot_gifs_click", tka.this.f7541i.pageId(), new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("gifs_order", i2 + "")});
                    if (tka.this.f7541i.f1754e) {
                        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vka
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                return this.f8342a.m7795N(sticker, view2);
                            }
                        });
                    }
                    xdl0.L(frameLayout, new View.OnClickListener() { // from class: l.wka
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f8571a.m7791P(sticker, i2, view2);
                        }
                    });
                }
                CoreModule.N().R9(simpleDraweeView, 10.0f);
                return;
            }
            if (i != -1) {
                AppCompatTextView appCompatTextView = (VText) ((LinearLayout) view).findViewById(y4c0.T0);
                if (!this.f7550d) {
                    xdl0.M(appCompatTextView, false);
                    return;
                } else if (this.f7549c.size() == 0) {
                    xdl0.M(appCompatTextView, false);
                    return;
                } else {
                    xdl0.M(appCompatTextView, this.f7549c.size() < 50);
                    return;
                }
            }
            AppCompatTextView appCompatTextView2 = (VText) view.findViewById(y4c0.H4);
            VLinear vLinear = (VLinear) view.findViewById(y4c0.J4);
            AppCompatTextView appCompatTextView3 = (VText) view.findViewById(y4c0.K4);
            AppCompatTextView appCompatTextView4 = (VText) view.findViewById(y4c0.B);
            xdl0.M(appCompatTextView2, this.f7549c.size() != 0);
            if (this.f7550d) {
                xdl0.M(appCompatTextView3, false);
                xdl0.M(appCompatTextView4, false);
                if (this.f7549c.size() == 0) {
                    xdl0.M(vLinear, true);
                    return;
                } else {
                    xdl0.M(vLinear, false);
                    return;
                }
            }
            xdl0.M(vLinear, false);
            if (this.f7549c.size() != 0) {
                xdl0.M(appCompatTextView3, false);
                xdl0.M(appCompatTextView4, false);
            } else {
                xdl0.M(appCompatTextView3, true);
                xdl0.M(appCompatTextView4, true);
                xdl0.L(appCompatTextView4, new View.OnClickListener() { // from class: l.xka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f8792a.m7797Q(view2);
                    }
                });
            }
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f7549c.size() + 1 || i == 0) {
                return null;
            }
            return this.f7549c.get(i - 1);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m7794M(Sticker sticker) {
            zvf0.u("e_add_hot_gif", tka.this.f7541i.pageId(), new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url)});
            tka.this.f7540h.m6881p0(sticker);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ boolean m7795N(final Sticker sticker, View view) {
            zvf0.A("e_add_hot_gif", tka.this.f7541i.pageId(), new j760[]{vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url)});
            w3z.m8465w(tka.this.f7541i, sticker, new Runnable() { // from class: l.yka
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9077a.m7794M(sticker);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m7796O(Sticker sticker) {
            tka.this.f7540h.m6881p0(sticker);
        }

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ void m7797Q(View view) {
            tka.this.f7540h.m6877F0(true);
        }

        /* JADX INFO: renamed from: R */
        public final /* synthetic */ void m7798R(View view) {
            tka.this.f7540h.m6876E0();
        }

        /* JADX INFO: renamed from: S */
        public void m7799S() {
            if (this.f7550d) {
                xdl0.M(tka.this.f7538f, false);
                return;
            }
            int size = this.f7549c.size();
            tka tkaVar = tka.this;
            if (size == 0) {
                xdl0.M(tkaVar.f7538f, false);
            } else {
                xdl0.M(tkaVar.f7538f, true);
                xdl0.E0(tka.this.f7538f, new View.OnClickListener() { // from class: l.zka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9377a.m7798R(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: T */
        public void m7800T(List<Sticker> list) {
            this.f7549c.clear();
            this.f7549c.addAll(list);
            m7799S();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: U */
        public void m7801U(boolean z) {
            this.f7550d = z;
        }

        /* JADX INFO: renamed from: V */
        public Picture.ImageUri m7802V(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        public int getItemViewType(int i) {
            if (i == this.f7549c.size() + 1) {
                return 0;
            }
            return i == 0 ? -1 : 1;
        }
    }

    public tka(CorePopularMemeAct corePopularMemeAct) {
        this.f7541i = corePopularMemeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m7769i(View view) {
        this.f7541i.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m7770j() {
        this.f7536d.clearFocus();
        this.f7541i.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7771k() {
        this.f7536d.setQuery(this.f7541i.f1755f, false);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7772C0() {
        return this.f7541i;
    }

    /* JADX INFO: renamed from: d */
    public View m7773d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bla.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m7776i1(pka pkaVar) {
        this.f7540h = pkaVar;
    }

    /* JADX INFO: renamed from: f */
    public void m7775f() {
        lsi0.h(R.string.B2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7773d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m7777l(List<Sticker> list) {
        this.f7542j.m7800T(list);
        this.f7542j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m */
    public void m7778m() {
        this.f7537e.scrollToPosition(0);
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
    /* JADX INFO: renamed from: r */
    public void m7779r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f7541i, 4);
        gridLayoutManager.v(new C0554b(gridLayoutManager));
        this.f7537e.setLayoutManager(gridLayoutManager);
        this.f7537e.setAdapter(this.f7542j);
        AppCompatTextView appCompatTextView = this.f7535c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        appCompatTextView.setTypeface(typeface);
        this.f7539g.setTypeface(typeface);
        this.f7536d.setQueryHint(this.f7541i.getString(R.string.f2));
        this.f7536d.setIconifiedByDefault(false);
        this.f7536d.setBackground(this.f7541i.getDrawable(c3c0.L5));
        View viewFindViewById = this.f7536d.findViewById(s5c0.I);
        SearchView.SearchAutoComplete searchAutoCompleteFindViewById = this.f7536d.findViewById(s5c0.J);
        xdl0.V(searchAutoCompleteFindViewById, 0);
        mep0.m6391e1(searchAutoCompleteFindViewById, n3c0.H);
        ImageView imageView = (ImageView) this.f7536d.findViewById(s5c0.E);
        xdl0.e0(imageView, 0);
        imageView.setImageResource(c3c0.Q);
        viewFindViewById.setBackgroundColor(this.f7541i.getResources().getColor(a1c0.Y));
        TextView textView = (TextView) this.f7536d.findViewById(s5c0.J);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setHintTextColor(Color.parseColor("#cbcbcb"));
        textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        ImageView imageView2 = (ImageView) this.f7536d.findViewById(s5c0.H);
        imageView2.setImageResource(c3c0.R);
        xdl0.V(imageView2, 0);
        xdl0.W(imageView2, 0);
        this.f7536d.setOnQueryTextListener(new C0555c(imageView));
        xdl0.E0(this.f7534b, new View.OnClickListener() { // from class: l.qka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6648a.m7769i(view);
            }
        });
        this.f7541i.postDelayed(new Runnable() { // from class: l.rka
            @Override // java.lang.Runnable
            public final void run() {
                this.f6975a.m7770j();
            }
        }, 20L);
        if (TextUtils.isEmpty(this.f7541i.f1755f)) {
            return;
        }
        this.f7541i.postDelayed(new Runnable() { // from class: l.ska
            @Override // java.lang.Runnable
            public final void run() {
                this.f7265a.m7771k();
            }
        }, 200L);
    }

    public void destroy() {
    }
}
