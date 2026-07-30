package p153l;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/oe20;", "", "<init>", "()V", "", "maxBitmapSize", "", "useDownSamplingRatio", "ensureTranscoderLibraryLoaded", "Ll/xkm;", "a", "(IZZ)Ll/xkm;", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class oe20 {

    @NotNull
    public static final oe20 INSTANCE = new oe20();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final xkm m167350a(int maxBitmapSize, boolean useDownSamplingRatio, boolean ensureTranscoderLibraryLoaded) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(maxBitmapSize), Boolean.valueOf(useDownSamplingRatio), Boolean.valueOf(ensureTranscoderLibraryLoaded));
            objNewInstance.getClass();
            return (xkm) objNewInstance;
        } catch (ClassNotFoundException e) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
            return null;
        } catch (IllegalAccessException e2) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
            return null;
        } catch (InstantiationException e4) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
            return null;
        } catch (SecurityException e6) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
            return null;
        } catch (InvocationTargetException e7) {
            vtq0.m202761a("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
            return null;
        }
    }
}
