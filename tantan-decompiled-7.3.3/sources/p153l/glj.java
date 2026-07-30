package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0017j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0017j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/glj;", "", "<init>", "()V", "", "bid", "Ll/elj;", "gameResource", "url", "Ljava/io/File;", "b", "(Ljava/lang/String;Ll/elj;Ljava/lang/String;)Ljava/io/File;", "a", "(Ljava/lang/String;Ll/elj;)Ljava/io/File;", "", "h", "(Ljava/lang/String;Ll/elj;)V", "", "unziped", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ll/elj;Z)V", "g", "(Ljava/lang/String;Ll/elj;)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "(Ljava/lang/String;Ll/elj;)Ljava/util/ArrayList;", "root", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)Ljava/util/ArrayList;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class glj {
    public static final glj INSTANCE = new glj();

    private glj() {
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final File m130653a(@Nullable String bid, @NotNull elj gameResource) {
        gameResource.getClass();
        File fileM130655c = m130655c(bid, gameResource, null, 4, null);
        if (!TextUtils.isEmpty(gameResource.f94558a)) {
            fileM130655c = new File(fileM130655c, gameResource.f94558a);
        }
        if (fileM130655c == null) {
            Intrinsics.m88386m();
        }
        if (!fileM130655c.exists()) {
            fileM130655c.mkdirs();
        }
        return fileM130655c;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final File m130654b(@Nullable String bid, @Nullable elj gameResource, @Nullable String url) {
        if (gameResource == null || !gameResource.f94563f) {
            return FepPackageManager.INSTANCE.m17673a().m17661i(bid, "custom", url, Long.parseLong("9999999999"));
        }
        File fileM110393b = ckw.m110393b();
        if (fileM110393b == null || bid == null) {
            return null;
        }
        return new File(fileM110393b, bid);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ File m130655c(String str, elj eljVar, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return m130654b(str, eljVar, str2);
    }

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> m130656d(File root) {
        List listEmptyList;
        File file = new File(root, "record.ini");
        if (!file.exists()) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            String strM17534r = FileUtil.m17534r(file);
            if (TextUtils.isEmpty(strM17534r)) {
                return arrayList;
            }
            strM17534r.getClass();
            List<String> listSplit = new Regex(SignParameters.NEW_LINE).split(strM17534r, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listEmptyList = CollectionsKt.emptyList();
                        break;
                    }
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
                break;
            }
            Object[] array = listEmptyList.toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            arrayList.addAll(Arrays.asList((String[]) Arrays.copyOf(strArr, strArr.length)));
            return arrayList;
        } catch (Throwable th) {
            Log.e("GameResourceFileUtils", "", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final ArrayList<String> m130657e(String bid, elj gameResource) {
        return m130656d(m130653a(bid, gameResource));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final String m130658f(@NotNull String url) {
        url.getClass();
        int iJ0 = StringsKt.m94334j0(url, "/", 0, false, 6, null);
        if (iJ0 >= 0) {
            return url.substring(iJ0 + 1);
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m130659g(@Nullable String bid, @NotNull elj gameResource) {
        gameResource.getClass();
        String str = gameResource.f94559b;
        str.getClass();
        String strM130658f = m130658f(str);
        if (TextUtils.isEmpty(strM130658f)) {
            return true;
        }
        ArrayList<String> arrayListM130657e = INSTANCE.m130657e(bid, gameResource);
        if (arrayListM130657e != null) {
            return arrayListM130657e.contains(strM130658f);
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m130660h(@Nullable String bid, @NotNull elj gameResource) throws Throwable {
        gameResource.getClass();
        File file = new File(m130653a(bid, gameResource), "record.ini");
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayListM130657e = INSTANCE.m130657e(bid, gameResource);
        if (arrayListM130657e != null) {
            arrayList.addAll(arrayListM130657e);
        }
        String str = gameResource.f94559b;
        str.getClass();
        arrayList.add(m130658f(str));
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        try {
            FileUtil.m17542z(file, sb.toString());
        } catch (IOException e) {
            Log.e("GameResourceFileUtils", "", e);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m130661i(@Nullable String bid, @NotNull elj gameResource, boolean unziped) throws Throwable {
        gameResource.getClass();
        File file = new File(m130653a(bid, gameResource), "record.ini");
        if (!unziped) {
            bid = "#";
        }
        try {
            FileUtil.m17542z(file, bid);
        } catch (IOException e) {
            Log.e("GameResourceFileUtils", "", e);
        }
    }
}
