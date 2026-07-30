package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/iiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "detail", "", "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class iiy implements pwl<d.a> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p009l.pwl
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        int iM20799f;
        String strM20796c;
        boolean z;
        boolean z2;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseS = detail.s();
        ProductCategory productCategory = merchandiseS.category;
        productCategory.getClass();
        String string = productCategory.toString();
        boolean z3 = true;
        String str = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar = q1e.INSTANCE;
                    if (!detail.I() || detail.G()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    strM20796c = q1eVar.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case -863315575:
                if (!string.equals("tttVip")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar2 = q1e.INSTANCE;
                    if (!detail.I() || detail.G()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String strM20797d = q1eVar2.m20797d(merchandiseS, z);
                    iM20799f = q1eVar2.m20799f(merchandiseS, detail.d(), detail.I());
                    str = strM20797d;
                    strM20796c = null;
                }
                break;
            case -796840475:
                if (!string.equals("oDiamond")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar3 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar3.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar3.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar4 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar4.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar4.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar5 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar5.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar5.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar6 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar6.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar6.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 165490388:
                if (!string.equals("privateCustom")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar7 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar7.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar7.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 175221999:
                if (!string.equals("oDiamondPrivateCustom")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar8 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar8.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar8.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar9 = q1e.INSTANCE;
                    if (detail.I()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    String strM20797d2 = q1eVar9.m20797d(merchandiseS, z);
                    iM20799f = q1eVar9.m20799f(merchandiseS, detail.d(), detail.I());
                    str = strM20797d2;
                    strM20796c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar10 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar10.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar10.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar11 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar11.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar11.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 1874772524:
                if (!string.equals("platinum")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar12 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar12.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar12.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    iM20799f = 0;
                    strM20796c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    iM20799f = 0;
                    strM20796c = null;
                } else {
                    q1e q1eVar13 = q1e.INSTANCE;
                    if (detail.I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM20796c = q1eVar13.m20796c(merchandiseS, z2);
                    iM20799f = q1eVar13.m20799f(merchandiseS, detail.d(), detail.I());
                }
                break;
            default:
                iM20799f = 0;
                strM20796c = null;
                break;
        }
        detail.b0(str);
        detail.Z(strM20796c);
        detail.a0(iM20799f);
        q1e q1eVar14 = q1e.INSTANCE;
        double d = detail.d();
        if (!detail.I() && !detail.G()) {
            z3 = false;
        }
        detail.Y(q1eVar14.m20794a(merchandiseS, d, z3));
    }
}
