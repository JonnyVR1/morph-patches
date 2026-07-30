package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/j3w;", "", "<init>", "()V", "", "msgId", "", "templateId", "Ll/zod;", "defaultHandlerParam", "", "b", "(Ljava/lang/String;ILl/zod;)V", "param", "a", "(Ll/zod;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class j3w {

    @NotNull
    public static final j3w INSTANCE = new j3w();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m143366b(@NotNull String msgId, int templateId, @Nullable zod defaultHandlerParam) {
        msgId.getClass();
        StringBuilder sb = new StringBuilder(" content  msgId = ");
        sb.append(msgId);
        sb.append(" templateId = ");
        sb.append(templateId);
        if (defaultHandlerParam != null) {
            sb.append(" currentTemplateIdList = ");
            sb.append(INSTANCE.m143367a(defaultHandlerParam));
        }
        nsh0.m164608j("[live][chat]message_render_error", sb.toString());
        CrashHelper.m82480d(new Exception("[live][chat]message_render_error".concat(" content  msgId = " + msgId + " templateId = " + templateId)), 20);
    }

    /* JADX INFO: renamed from: a */
    public final String m143367a(zod param) {
        int[] intArray;
        HashMap<Integer, BLiveTemplate> mapM157080g;
        m500 m500VarM220736d = param.m220736d();
        if (m500VarM220736d == null || (mapM157080g = m500VarM220736d.m157080g()) == null) {
            intArray = null;
        } else {
            ArrayList arrayList = new ArrayList(mapM157080g.size());
            Iterator<Map.Entry<Integer, BLiveTemplate>> it = mapM157080g.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            intArray = CollectionsKt.toIntArray(arrayList);
        }
        String string = Arrays.toString(intArray);
        string.getClass();
        return string;
    }
}
