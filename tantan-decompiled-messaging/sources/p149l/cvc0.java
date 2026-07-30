package p149l;

import com.googlecode.mp4parser.AbstractBox;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/* JADX INFO: loaded from: classes7.dex */
@Aspect
public class cvc0 {

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ Throwable f82656a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cvc0 f82657b = null;

    static {
        try {
            m108850a();
        } catch (Throwable th) {
            f82656a = th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ void m108850a() {
        f82657b = new cvc0();
    }

    /* JADX INFO: renamed from: b */
    public static cvc0 m108851b() {
        cvc0 cvc0Var = f82657b;
        if (cvc0Var != null) {
            return cvc0Var;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", f82656a);
    }

    @Before("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    /* JADX INFO: renamed from: c */
    public void m108852c(JoinPoint joinPoint) {
        if (!(joinPoint.getTarget() instanceof AbstractBox)) {
            tqq0.m190155a("Only methods in subclasses of ", AbstractBox.class.getName(), " can  be annotated with ParseDetail");
        } else {
            if (((AbstractBox) joinPoint.getTarget()).isParsed()) {
                return;
            }
            ((AbstractBox) joinPoint.getTarget()).parseDetails();
        }
    }
}
