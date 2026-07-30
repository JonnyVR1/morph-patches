package p153l;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0010H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u0018J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m88121d2 = {"Ll/xgn0;", "Ll/lb2;", "Ll/wgn0;", "presenter", "", "Ll/fgn0;", "pageData", "Ll/ngn0;", OMSTemplateType.dialog, "<init>", "(Ll/wgn0;Ljava/util/List;Ll/ngn0;)V", "", "getCount", "()I", "Landroid/view/View;", "p0", "", "p1", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", FirebaseAnalytics.Param.INDEX, "", "q", "(I)V", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "Landroid/view/ViewGroup;", "container", "position", "u", "(Landroid/view/ViewGroup;I)Landroid/view/View;", OMSTemplateModeType.view, "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "obj", "getItemPosition", "(Ljava/lang/Object;)I", "show", ResourceDirection.f39656v, "(Z)V", Constants.KEY_T, "r", "(I)Landroid/view/View;", "e", "Ll/wgn0;", "getPresenter", "()Ll/wgn0;", "f", "Ljava/util/List;", "g", "Ll/ngn0;", "getDialog", "()Ll/ngn0;", "", "h", "Ljava/util/Map;", "dataList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xgn0 extends lb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final wgn0<?> presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<fgn0> pageData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ngn0 dialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, View> dataList;

    public xgn0(@NotNull wgn0<?> wgn0Var, @NotNull List<fgn0> list, @NotNull ngn0 ngn0Var) {
        wgn0Var.getClass();
        list.getClass();
        ngn0Var.getClass();
        this.presenter = wgn0Var;
        this.pageData = list;
        this.dialog = ngn0Var;
        this.dataList = new LinkedHashMap();
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.pageData.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NotNull Object obj) {
        obj.getClass();
        if (this.dataList.isEmpty()) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View p0, @NotNull Object p1) {
        p0.getClass();
        p1.getClass();
        return Intrinsics.m88377d(p0, p1);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(@NotNull ViewGroup container, int position, @NotNull Object view) {
        container.getClass();
        view.getClass();
        container.removeView((View) view);
    }

    /* JADX INFO: renamed from: q */
    public final void m210928q(int index) {
        KeyEvent.Callback callback = (View) this.dataList.get(Integer.valueOf(index));
        if (callback == null || !(callback instanceof iul)) {
            return;
        }
        ((iul) callback).mo78513d();
    }

    /* JADX INFO: renamed from: r */
    public final View m210929r(int position) {
        return this.pageData.get(position).m125506b(this.presenter);
    }

    /* JADX INFO: renamed from: s */
    public final void m210930s() {
        for (Map.Entry<Integer, View> entry : this.dataList.entrySet()) {
            if (entry.getValue() instanceof iul) {
                KeyEvent.Callback value = entry.getValue();
                value.getClass();
                ((iul) value).mo78512c();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m210931t(int position) {
        KeyEvent.Callback callback = (View) this.dataList.get(Integer.valueOf(position));
        if (callback == null || !(callback instanceof iul)) {
            return;
        }
        ((iul) callback).mo78514e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public View mo40046p(@NotNull ViewGroup container, int position) {
        container.getClass();
        if (this.dataList.get(Integer.valueOf(position)) == null) {
            this.dataList.put(Integer.valueOf(position), m210929r(position));
        }
        View view = this.dataList.get(Integer.valueOf(position));
        view.getClass();
        View view2 = view;
        if (view2 instanceof iul) {
            ((iul) view2).mo78510a(this.dialog);
        }
        container.addView(view2);
        return view2;
    }

    /* JADX INFO: renamed from: v */
    public final void m210933v(boolean show) {
        for (Map.Entry<Integer, View> entry : this.dataList.entrySet()) {
            if (entry.getValue() instanceof iul) {
                KeyEvent.Callback value = entry.getValue();
                value.getClass();
                ((iul) value).mo78511b(show);
            }
        }
    }
}
