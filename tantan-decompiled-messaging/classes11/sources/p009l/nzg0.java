package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeCustomModelItem;
import com.p1.mobile.putong.core.data.IdealTypes;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dac0;
import l.e30;
import l.k6c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001b\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010 \"\u0004\b5\u0010#¨\u00067"}, d2 = {"Ll/nzg0;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IdealTypes;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Ll/e30;", "", "action", "", "H", "(Ll/e30;)V", "Ll/y4;", "uiAdapter", "I", "(Ll/y4;)V", "convertView", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "position", "F", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IdealTypes;II)V", "", "", "K", "()Ljava/util/List;", "supremeCustomModels", "L", "(Ljava/util/List;)V", "J", "(I)Lcom/p1/mobile/putong/core/data/IdealTypes;", "C", "()I", "c", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "getAct", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomAct;", "d", "Ll/e30;", "btnChangeAction", "e", "Ll/y4;", "customUiAdapter", "f", "Ljava/util/List;", "getDataLists", "setDataLists", "dataLists", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nzg0 extends dac0<IdealTypes> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SupremeCustomAct act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public e30<Boolean> btnChangeAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AbstractC1322y4 customUiAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public List<? extends IdealTypes> dataLists;

    public nzg0(@NotNull SupremeCustomAct supremeCustomAct) {
        supremeCustomAct.getClass();
        this.act = supremeCustomAct;
    }

    /* JADX INFO: renamed from: G */
    public static final void m19542G(IdealTypes idealTypes, SupremeCustomModelItem supremeCustomModelItem, nzg0 nzg0Var, View view) {
        boolean z = false;
        if (idealTypes.selected) {
            idealTypes.selected = false;
            supremeCustomModelItem.m7857l0();
        } else {
            idealTypes.selected = true;
            supremeCustomModelItem.m7855j0();
        }
        List<? extends IdealTypes> list = nzg0Var.dataLists;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((IdealTypes) it.next()).selected) {
                    z = true;
                }
            }
        }
        e30<Boolean> e30Var = nzg0Var.btnChangeAction;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m19544C() {
        List<? extends IdealTypes> list = this.dataLists;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m19545D(@Nullable ViewGroup parent, int itemViewType) {
        View viewInflate = this.act.inflater().inflate(k6c0.D1, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.core.newui.supreme.SupremeCustomModelItem] */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m19543A(@Nullable View convertView, @NotNull final IdealTypes data, int itemViewType, int position) {
        data.getClass();
        convertView.getClass();
        final ?? r1 = (SupremeCustomModelItem) convertView;
        AbstractC1322y4 abstractC1322y4 = this.customUiAdapter;
        if (abstractC1322y4 != null) {
            abstractC1322y4.mo18218j(r1.get_mask());
        }
        AbstractC1322y4 abstractC1322y5 = this.customUiAdapter;
        if (abstractC1322y5 != null) {
            abstractC1322y5.mo18219k(r1.get_selectborder());
        }
        r1.m7854i0(data);
        xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.mzg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nzg0.m19542G(data, r1, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m19547H(@NotNull e30<Boolean> action) {
        action.getClass();
        this.btnChangeAction = action;
    }

    /* JADX INFO: renamed from: I */
    public final void m19548I(@NotNull AbstractC1322y4 uiAdapter) {
        uiAdapter.getClass();
        this.customUiAdapter = uiAdapter;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public IdealTypes getItem(int position) {
        List<? extends IdealTypes> list = this.dataLists;
        list.getClass();
        return list.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final List<String> m19550K() {
        ArrayList arrayList = new ArrayList();
        List<? extends IdealTypes> list = this.dataLists;
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<? extends IdealTypes> list2 = this.dataLists;
            list2.getClass();
            if (list2.get(i).selected) {
                String str = getItem(i).value;
                str.getClass();
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final void m19551L(@NotNull List<? extends IdealTypes> supremeCustomModels) {
        supremeCustomModels.getClass();
        this.dataLists = supremeCustomModels;
    }
}
