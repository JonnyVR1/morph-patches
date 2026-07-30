package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/fry;", "Ll/hzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fry implements hzl<C8928d.a> {
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
    @Override // p153l.hzl
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo106190a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8928d.a detail) {
        int iM119281f;
        String strM119278c;
        boolean z;
        boolean z2;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM54784s = detail.m54784s();
        ProductCategory productCategory = merchandiseM54784s.category;
        productCategory.getClass();
        String string = productCategory.toString();
        boolean z3 = true;
        String str = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar = e3e.INSTANCE;
                    if (!detail.m54736I() || detail.m54734G()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    strM119278c = e3eVar.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case -863315575:
                if (!string.equals(ProductCategory.tttVip)) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar2 = e3e.INSTANCE;
                    if (!detail.m54736I() || detail.m54734G()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String strM119279d = e3eVar2.m119279d(merchandiseM54784s, z);
                    iM119281f = e3eVar2.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                    str = strM119279d;
                    strM119278c = null;
                }
                break;
            case -796840475:
                if (!string.equals("oDiamond")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar3 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar3.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar3.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar4 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar4.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar4.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar5 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar5.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar5.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar6 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar6.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar6.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 165490388:
                if (!string.equals("privateCustom")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar7 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar7.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar7.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 175221999:
                if (!string.equals(ProductCategory.oDiamondPrivateCustom)) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar8 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar8.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar8.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar9 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    String strM119279d2 = e3eVar9.m119279d(merchandiseM54784s, z);
                    iM119281f = e3eVar9.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                    str = strM119279d2;
                    strM119278c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar10 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar10.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar10.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar11 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar11.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar11.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 1874772524:
                if (!string.equals("platinum")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar12 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar12.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar12.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    iM119281f = 0;
                    strM119278c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    iM119281f = 0;
                    strM119278c = null;
                } else {
                    e3e e3eVar13 = e3e.INSTANCE;
                    if (detail.m54736I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM119278c = e3eVar13.m119278c(merchandiseM54784s, z2);
                    iM119281f = e3eVar13.m119281f(merchandiseM54784s, detail.m54758d(), detail.m54736I());
                }
                break;
            default:
                iM119281f = 0;
                strM119278c = null;
                break;
        }
        detail.m54755b0(str);
        detail.m54753Z(strM119278c);
        detail.m54754a0(iM119281f);
        e3e e3eVar14 = e3e.INSTANCE;
        double dM54758d = detail.m54758d();
        if (!detail.m54736I() && !detail.m54734G()) {
            z3 = false;
        }
        detail.m54752Y(e3eVar14.m119276a(merchandiseM54784s, dM54758d, z3));
    }
}
