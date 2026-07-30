package org.junit.experimental.theories;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PotentialAssignment {
    public static PotentialAssignment forValue(final String str, final Object obj) {
        return new PotentialAssignment() { // from class: org.junit.experimental.theories.PotentialAssignment.1
            @Override // org.junit.experimental.theories.PotentialAssignment
            public String getDescription() {
                String str2;
                Object obj2 = obj;
                if (obj2 == null) {
                    str2 = "null";
                } else {
                    try {
                        str2 = String.format("\"%s\"", obj2);
                    } catch (Throwable th) {
                        str2 = String.format("[toString() threw %s: %s]", th.getClass().getSimpleName(), th.getMessage());
                    }
                }
                return String.format("%s <from %s>", str2, str);
            }

            @Override // org.junit.experimental.theories.PotentialAssignment
            public Object getValue() {
                return obj;
            }

            public String toString() {
                return String.format("[%s]", obj);
            }
        };
    }

    public abstract String getDescription() throws CouldNotGenerateValueException;

    public abstract Object getValue() throws CouldNotGenerateValueException;

    public static class CouldNotGenerateValueException extends Exception {
        private static final long serialVersionUID = 1;

        public CouldNotGenerateValueException() {
        }

        public CouldNotGenerateValueException(Throwable th) {
            super(th);
        }
    }
}
