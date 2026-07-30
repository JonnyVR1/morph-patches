package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.AiTranslateLanguage;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;

/* JADX INFO: renamed from: l.q0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m87232d2 = {"Ll/q0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "langKey", "langName", "", "onSelected", "<init>", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function2;)V", "F", "()V", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "show", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "languages", "I", "(Ljava/util/List;)V", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Lkotlin/jvm/functions/Function2;", "Ll/q0$a;", "h", "Ll/q0$a;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", RXScreenCaptureService.KEY_INDEX, "Landroidx/recyclerview/widget/RecyclerView;", "languageListView", "j", "Ljava/lang/String;", "currentLangKey", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DialogC19382q0 extends l5j0 {

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
    @Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Ll/q0$a;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "", "selectedKey", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "langKey", "langName", "", "onItemClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "languages", "H", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/data/AiTranslateLanguage;II)V", "G", "(I)Lcom/p1/mobile/putong/data/AiTranslateLanguage;", b2s.C_ZONE, "()I", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function2;", "e", "Ljava/util/List;", "data", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        public static void m172269E(a aVar, AiTranslateLanguage aiTranslateLanguage, View view) {
            Function2<String, String, Unit> function2 = aVar.onItemClick;
            String str = aiTranslateLanguage.key;
            str.getClass();
            String str2 = aiTranslateLanguage.name;
            str2.getClass();
            function2.invoke(str, str2);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.data.size();
        }

        @Override // p149l.dac0
        @NotNull
        /* JADX INFO: renamed from: D */
        public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
            parent.getClass();
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f6c0.f95266A, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(@NotNull View convertView, @NotNull final AiTranslateLanguage item, int itemViewType, int position) {
            convertView.getClass();
            item.getClass();
            VText_Medium vText_Medium = (VText_Medium) convertView.findViewById(u4c0.f173842H6);
            VImage vImage = (VImage) convertView.findViewById(u4c0.f173825G6);
            boolean zEquals = TextUtils.equals(item.key, this.selectedKey);
            vText_Medium.setText(item.name);
            convertView.setBackgroundResource(zEquals ? x2c0.f190443p0 : x2c0.f190411o0);
            xdl0.m208345M0(vImage, zEquals);
            xdl0.m208329E0(convertView, new View.OnClickListener() { // from class: l.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC19382q0.a.m172269E(this.f146519a, item, view);
                }
            });
        }

        @Override // p149l.dac0
        @NotNull
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public AiTranslateLanguage getItem(int position) {
            return this.data.get(position);
        }

        /* JADX INFO: renamed from: H */
        public final void m172272H(@NotNull List<? extends AiTranslateLanguage> languages) {
            languages.getClass();
            this.data = languages;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.q0$b */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/q0$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
                outRect.bottom = t100.m186890d(30.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC19382q0(@NotNull Act act, @NotNull Function2<? super String, ? super String, Unit> function2) {
        super(act, v7c0.f180356c);
        act.getClass();
        function2.getClass();
        this.act = act;
        this.onSelected = function2;
        this.currentLangKey = C17441i0.m133730e();
    }

    /* JADX INFO: renamed from: A */
    public static Unit m172258A(final DialogC19382q0 dialogC19382q0, final String str, final String str2) {
        str.getClass();
        str2.getClass();
        dialogC19382q0.act.duringCreated(C17441i0.m133731f(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.n0
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC19382q0.m172263G(this.f136453a, str, str2, (Unit) obj);
            }
        }, new e30() { // from class: l.o0
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC19382q0.m172264H((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static void m172260D(DialogC19382q0 dialogC19382q0, View view) {
        dialogC19382q0.m101651T();
    }

    /* JADX INFO: renamed from: E */
    private final void m172261E() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        View viewFindViewById = window.findViewById(R.id.content);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewFindViewById.findViewById(u4c0.f174391o2);
        viewFindViewById2.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        bottomSheetBehaviorFrom.getClass();
        frameLayout.setBackgroundResource(n3c0.f136962a);
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
    private final void m172262F() {
        View viewInflate = LayoutInflater.from(this.act).inflate(f6c0.f95282B, (ViewGroup) null);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173752C1), new View.OnClickListener() { // from class: l.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC19382q0.m172260D(this.f120432a, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(u4c0.f173859I6);
        this.languageListView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.act));
        a aVar = new a(this.currentLangKey, new Function2() { // from class: l.l0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DialogC19382q0.m172258A(this.f125435a, (String) obj, (String) obj2);
            }
        });
        this.adapter = aVar;
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new b());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setContentView(viewInflate, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(44.0f);
    }

    /* JADX INFO: renamed from: G */
    public static final void m172263G(DialogC19382q0 dialogC19382q0, String str, String str2, Unit unit) {
        dialogC19382q0.onSelected.invoke(str, str2);
        dialogC19382q0.m101651T();
    }

    /* JADX INFO: renamed from: H */
    public static final void m172264H(Throwable th) {
        if (TextUtils.isEmpty(th != null ? th.getMessage() : null)) {
            return;
        }
        lsi0.m151595y(th != null ? th.getMessage() : null);
    }

    /* JADX INFO: renamed from: y */
    public static void m172266y(DialogC19382q0 dialogC19382q0, int i) {
        RecyclerView recyclerView = dialogC19382q0.languageListView;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, C15167a.m87596b((recyclerView.getHeight() - t100.m186890d(56.0f)) / 2, 0));
    }

    /* JADX INFO: renamed from: z */
    public static void m172267z(DialogC19382q0 dialogC19382q0, List list) {
        if (dialogC19382q0.act.isFinishing()) {
            return;
        }
        a aVar = dialogC19382q0.adapter;
        if (aVar != null) {
            list.getClass();
            aVar.m172272H(list);
        }
        super.show();
        dialogC19382q0.m172261E();
        list.getClass();
        dialogC19382q0.m172268I(list);
    }

    /* JADX INFO: renamed from: I */
    public final void m172268I(List<? extends AiTranslateLanguage> languages) {
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
                    DialogC19382q0.m172266y(this.f130694a, i);
                }
            });
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        m172262F();
        CoreModule.f17545c.f19684t0.m30027k3().subscribe(mkd0.m154955G(new e30() { // from class: l.j0
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC19382q0.m172267z(this.f115609a, (List) obj);
            }
        }));
    }
}
