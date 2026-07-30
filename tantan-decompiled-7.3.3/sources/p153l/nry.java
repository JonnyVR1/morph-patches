package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/nry;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Ll/hzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ljava/util/List;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nry {

    @NotNull
    public static final nry INSTANCE = new nry();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<hzl<C8928d.a>> m164539a(@NotNull ProductCategory category) {
        izl pryVar;
        category.getClass();
        switch (category.toString()) {
            case "superLikeMembership":
            case "tttVip":
                pryVar = new rry();
                break;
            case "oDiamond":
            case "youthVip":
                pryVar = new qry();
                break;
            case "unlimitedSwipes":
            case "svipPicksMembership":
                pryVar = new rry();
                break;
            case "svip":
            case "privateCustom":
            case "oDiamondPrivateCustom":
            case "femaleVip":
                pryVar = new qry();
                break;
            case "quickchatMembership":
            case "roaming":
            case "undoMembership":
                pryVar = new rry();
                break;
            case "platinum":
                pryVar = new qry();
                break;
            case "picksMembership":
                pryVar = new rry();
                break;
            default:
                pryVar = new pry();
                break;
        }
        return pryVar.mo142811a(category);
    }
}
