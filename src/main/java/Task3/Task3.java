package Task3;

import Task3.enums.PaymentType;
import Task3.textEdit.TextEdit;
import Task3.textEdit.TextEditChangeHandler;

public class Task3 implements TextEditChangeHandler {
    private final PaymentType paymentType;
    private final TextEdit textEditPaymentAmount;

    public Task3(PaymentType paymentType, TextEdit textEditPaymentAmount) {
        this.paymentType = paymentType;
        this.textEditPaymentAmount = textEditPaymentAmount;
    }

    @Override
    public void afterTextChanged(TextEdit textField) {
        if (paymentType == PaymentType.CASH || paymentType == PaymentType.CREDIT_CARD) {
            if (textField.length() == 9) {
                textEditPaymentAmount.requestFocus();
            }
        }
    }
}
