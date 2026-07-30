package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/m310;", "Ll/dac0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/h4t;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/h4t;)V", "Landroid/view/ViewGroup;", "parent", "resource", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "convertView", Item.TYPE, "itemViewType", "position", "E", "(Landroid/view/View;III)V", "G", "(I)Ljava/lang/Integer;", "c", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Ll/h4t;", "e", "Landroid/view/View;", "F", "()Landroid/view/View;", "setCurItemView", "(Landroid/view/View;)V", "curItemView", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class m310 extends dac0<Integer> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final h4t<?, ?> presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View curItemView;

    public m310(@NotNull Act act, @NotNull h4t<?, ?> h4tVar) {
        act.getClass();
        h4tVar.getClass();
        this.act = act;
        this.presenter = h4tVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo28823A(View view, Integer num, int i, int i2) {
        mo152806E(view, num.intValue(), i, i2);
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, @LayoutRes int resource) {
        parent.getClass();
        View viewInflate = this.act.inflater().inflate(resource, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public void mo152806E(@NotNull View convertView, int item, int itemViewType, int position) {
        convertView.getClass();
        mcr mcrVar = this.presenter;
        if ((mcrVar instanceof qxl) && (convertView instanceof s7m)) {
            ((qxl) mcrVar).mo95516z1((s7m) convertView);
        }
        if (convertView instanceof rxl) {
            ((rxl) convertView).mo75693R(this.act);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: from getter */
    public final View getCurItemView() {
        return this.curItemView;
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int position) {
        return Integer.valueOf(position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.AbstractC0566d0 holder) {
        holder.getClass();
        super.onViewAttachedToWindow(holder);
        View view = holder.itemView;
        view.getClass();
        this.curItemView = view;
        if (view instanceof rxl) {
            ((rxl) view).mo75692F();
        }
    }
}
