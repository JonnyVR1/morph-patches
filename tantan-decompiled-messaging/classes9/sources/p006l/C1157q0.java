package p006l;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.AiTranslateLanguage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dac0;
import l.e30;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.n3c0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;

/* JADX INFO: renamed from: l.q0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Ll/q0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "langKey", "langName", "", "onSelected", "<init>", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function2;)V", "F", "()V", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "show", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "languages", "I", "(Ljava/util/List;)V", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Lkotlin/jvm/functions/Function2;", "Ll/q0$a;", "h", "Ll/q0$a;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "i", "Landroidx/recyclerview/widget/RecyclerView;", "languageListView", "j", "Ljava/lang/String;", "currentLangKey", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C1157q0 extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Function2<String, String, Unit> onSelected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public a adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public RecyclerView languageListView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String currentLangKey;

    /* JADX INFO: renamed from: l.q0$a */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Ll/q0$a;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "", "selectedKey", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "langKey", "langName", "", "onItemClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "languages", "H", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/data/AiTranslateLanguage;II)V", "G", "(I)Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "C", "()I", "c", "Ljava/lang/String;", "d", "Lkotlin/jvm/functions/Function2;", "e", "Ljava/util/List;", "data", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends dac0<AiTranslateLanguage> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String selectedKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Function2<String, String, Unit> onItemClick;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public List<? extends AiTranslateLanguage> data;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String str, @NotNull Function2<? super String, ? super String, Unit> function2) {
            str.getClass();
            function2.getClass();
            this.selectedKey = str;
            this.onItemClick = function2;
            this.data = CollectionsKt.emptyList();
        }

        /* JADX INFO: renamed from: E */
        public static void m21888E(a aVar, AiTranslateLanguage aiTranslateLanguage, View view) {
            Function2<String, String, Unit> function2 = aVar.onItemClick;
            String str = aiTranslateLanguage.key;
            str.getClass();
            String str2 = aiTranslateLanguage.name;
            str2.getClass();
            function2.invoke(str, str2);
        }

        /* JADX INFO: renamed from: C */
        public int m21890C() {
            return this.data.size();
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public View m21891D(@NotNull ViewGroup parent, int itemViewType) {
            parent.getClass();
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f6c0.f11680A, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m21889A(@NotNull View convertView, @NotNull final AiTranslateLanguage item, int itemViewType, int position) {
            convertView.getClass();
            item.getClass();
            VText_Medium vText_MediumFindViewById = convertView.findViewById(u4c0.f22590H6);
            VImage vImageFindViewById = convertView.findViewById(u4c0.f22573G6);
            boolean zEquals = TextUtils.equals(item.key, this.selectedKey);
            vText_MediumFindViewById.setText(item.name);
            convertView.setBackgroundResource(zEquals ? x2c0.f26979p0 : x2c0.f26947o0);
            xdl0.M0(vImageFindViewById, zEquals);
            xdl0.E0(convertView, new View.OnClickListener() { // from class: l.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1157q0.a.m21888E(this.f18526a, item, view);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public AiTranslateLanguage getItem(int position) {
            return this.data.get(position);
        }

        /* JADX INFO: renamed from: H */
        public final void m21894H(@NotNull List<? extends AiTranslateLanguage> languages) {
            languages.getClass();
            this.data = languages;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.q0$b */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/q0$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
                outRect.bottom = t100.d(30.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1157q0(@NotNull Act act, @NotNull Function2<? super String, ? super String, Unit> function2) {
        super(act, v7c0.f24183c);
        act.getClass();
        function2.getClass();
        this.act = act;
        this.onSelected = function2;
        this.currentLangKey = C0819i0.m16409e();
    }

    /* JADX INFO: renamed from: A */
    public static Unit m21877A(final C1157q0 c1157q0, final String str, final String str2) {
        str.getClass();
        str2.getClass();
        c1157q0.act.duringCreated(C0819i0.m16410f(str)).subscribe(mkd0.H(new e30() { // from class: l.n0
            public final void call(Object obj) {
                C1157q0.m21882G(this.f17422a, str, str2, (Unit) obj);
            }
        }, new e30() { // from class: l.o0
            public final void call(Object obj) {
                C1157q0.m21883H((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static void m21879D(C1157q0 c1157q0, View view) {
        c1157q0.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private final void m21880E() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        View viewFindViewById = window.findViewById(R.id.content);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewFindViewById.findViewById(u4c0.f23139o2);
        viewFindViewById2.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        bottomSheetBehaviorFrom.getClass();
        frameLayout.setBackgroundResource(n3c0.a);
        int i = this.act.getResources().getDisplayMetrics().heightPixels;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = i;
        frameLayout.setLayoutParams(layoutParams);
        bottomSheetBehaviorFrom.setPeekHeight(i);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.setHideable(false);
    }

    /* JADX INFO: renamed from: F */
    private final void m21881F() {
        View viewInflate = LayoutInflater.from(this.act).inflate(f6c0.f11696B, (ViewGroup) null);
        xdl0.E0(viewInflate.findViewById(u4c0.f22500C1), new View.OnClickListener() { // from class: l.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1157q0.m21879D(this.f15516a, view);
            }
        });
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(u4c0.f22607I6);
        this.languageListView = recyclerViewFindViewById;
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(this.act));
        a aVar = new a(this.currentLangKey, new Function2() { // from class: l.l0
            public final Object invoke(Object obj, Object obj2) {
                return C1157q0.m21877A(this.f16120a, (String) obj, (String) obj2);
            }
        });
        this.adapter = aVar;
        recyclerViewFindViewById.setAdapter(aVar);
        recyclerViewFindViewById.addItemDecoration(new b());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(viewInflate, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(44.0f);
    }

    /* JADX INFO: renamed from: G */
    public static final void m21882G(C1157q0 c1157q0, String str, String str2, Unit unit) {
        c1157q0.onSelected.invoke(str, str2);
        c1157q0.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static final void m21883H(Throwable th) {
        if (TextUtils.isEmpty(th != null ? th.getMessage() : null)) {
            return;
        }
        lsi0.y(th != null ? th.getMessage() : null);
    }

    /* JADX INFO: renamed from: y */
    public static void m21885y(C1157q0 c1157q0, int i) {
        RecyclerView recyclerView = c1157q0.languageListView;
        if (recyclerView == null) {
            return;
        }
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, kotlin.ranges.a.b((recyclerView.getHeight() - t100.d(56.0f)) / 2, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m21886z(C1157q0 c1157q0, List list) {
        if (c1157q0.act.isFinishing()) {
            return;
        }
        a aVar = c1157q0.adapter;
        if (aVar != null) {
            list.getClass();
            aVar.m21894H(list);
        }
        super/*android.app.Dialog*/.show();
        c1157q0.m21880E();
        list.getClass();
        c1157q0.m21887I(list);
    }

    /* JADX INFO: renamed from: I */
    public final void m21887I(List<? extends AiTranslateLanguage> languages) {
        RecyclerView recyclerView;
        Iterator<? extends AiTranslateLanguage> it = languages.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (TextUtils.equals(it.next().key, this.currentLangKey)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0 && (recyclerView = this.languageListView) != null) {
            recyclerView.post(new Runnable() { // from class: l.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C1157q0.m21885y(this.f16730a, i);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(savedInstanceState);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public void show() {
        m21881F();
        CoreModule.f1534c.f3673t0.m1955k3().subscribe(mkd0.G(new e30() { // from class: l.j0
            public final void call(Object obj) {
                C1157q0.m21886z(this.f14910a, (List) obj);
            }
        }));
    }
}
